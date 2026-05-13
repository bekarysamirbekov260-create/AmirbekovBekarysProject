package com.amirbekov.amirbekovbelarysproject.dto;

import lombok.Data;
import java.util.Set;

@Data
public class BekarysUserDTO {
    private Long id;
    private String username;
    private String email;
    private Set<String> roles;
}