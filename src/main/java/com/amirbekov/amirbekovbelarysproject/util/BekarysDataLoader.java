package com.amirbekov.amirbekovbelarysproject.util;

import com.amirbekov.amirbekovbelarysproject.entity.*;
import com.amirbekov.amirbekovbelarysproject.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.math.BigDecimal;
import java.util.Set;

@Component
@RequiredArgsConstructor
public class BekarysDataLoader implements CommandLineRunner {

    private final BekarysUserRepository userRepository;
    private final BekarysCourseRepository courseRepository;
    private final BekarysCategoryRepository categoryRepository;

    @Override
    public void run(String... args) throws Exception {
        // 1. Создаем категорию
        BekarysCategory programming = BekarysCategory.builder()
                .name("Programming")
                .build();
        categoryRepository.save(programming);

        // 2. Создаем тебя как пользователя
        BekarysUser bekarys = BekarysUser.builder()
                .username("Bekarys")
                .password("password123") // Позже зашифруем
                .email("bekarys@amirbekov.com")
                .roles(Set.of("ROLE_ADMIN"))
                .build();
        userRepository.save(bekarys);

        // 3. Создаем курс
        BekarysCourse springCourse = BekarysCourse.builder()
                .title("Spring Boot Mastery by Bekarys")
                .description("Полный курс по разработке бэкенда")
                .price(new BigDecimal("49.99"))
                .author(bekarys)
                .category(programming)
                .build();
        courseRepository.save(springCourse);

        System.out.println(">> [SUCCESS] Тестовые данные для Бекарыса загружены в БД!");
    }
}