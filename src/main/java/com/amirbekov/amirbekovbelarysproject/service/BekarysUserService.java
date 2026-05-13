package com.amirbekov.amirbekovbelarysproject.service;

import com.amirbekov.amirbekovbelarysproject.entity.BekarysUser;
import com.amirbekov.amirbekovbelarysproject.repository.BekarysUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BekarysUserService {

    private final BekarysUserRepository userRepository;

    public BekarysUser registerUser(BekarysUser user) {
        // Здесь позже добавим шифрование пароля
        return userRepository.save(user);
    }
}