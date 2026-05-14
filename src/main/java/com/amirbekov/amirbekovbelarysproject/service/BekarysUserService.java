package com.amirbekov.amirbekovbelarysproject.service;

import com.amirbekov.amirbekovbelarysproject.entity.BekarysUser;
import com.amirbekov.amirbekovbelarysproject.repository.BekarysUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder; // проверь этот импорт
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BekarysUserService {

    private final BekarysUserRepository userRepository;
    private final PasswordEncoder passwordEncoder; // Поле для шифрования

    // ОСТАВЛЯЕМ ТОЛЬКО ОДИН ЭТОТ МЕТОД
    public BekarysUser registerUser(BekarysUser user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        BekarysUser savedUser = userRepository.save(user);

        // Вызываем асинхронно!
        sendWelcomeEmail(savedUser.getEmail());

        return savedUser;
    }
    @org.springframework.scheduling.annotation.Async
    public void sendWelcomeEmail(String email) {
        // Имитируем долгую отправку письма (3 секунды)
        try {
            Thread.sleep(3000);
            System.out.println("Email successfully sent to: " + email + " (Asynchronously)");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}