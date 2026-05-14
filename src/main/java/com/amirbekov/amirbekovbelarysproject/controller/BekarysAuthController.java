package com.amirbekov.amirbekovbelarysproject.controller;

import com.amirbekov.amirbekovbelarysproject.entity.BekarysUser;
import com.amirbekov.amirbekovbelarysproject.service.BekarysUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth") // Это тот путь, который ты вводишь в Postman
@RequiredArgsConstructor
public class BekarysAuthController {

    private final BekarysUserService userService;

    @PostMapping("/register")
    public BekarysUser register(@RequestBody BekarysUser user) {
        return userService.registerUser(user);
    }
}