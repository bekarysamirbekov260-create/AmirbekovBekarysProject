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
        // Шифруем пароль перед сохранением
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }
}