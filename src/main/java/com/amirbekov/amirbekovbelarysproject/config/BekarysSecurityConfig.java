package com.amirbekov.amirbekovbelarysproject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class BekarysSecurityConfig {


    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                // 1. Полностью отключаем CSRF для работы с Postman
                .csrf(csrf -> csrf.disable())

                // 2. Настраиваем доступы (убедись, что пути совпадают с контроллерами)
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/api/auth/**").permitAll()   // Для регистрации
                        .requestMatchers("/api/courses/**").permitAll() // Для просмотра курсов
                        .anyRequest().authenticated()                   // Все остальное по паролю
                )

                // 3. Отключаем стандартную форму логина, чтобы она не перехватывала запросы
                .formLogin(form -> form.disable())
                .httpBasic(basic -> basic.disable());

        return http.build();
    }
    @Bean
    public org.springframework.security.crypto.password.PasswordEncoder passwordEncoder() {
        return new org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder();
    }
}