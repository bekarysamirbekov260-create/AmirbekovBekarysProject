package com.amirbekov.amirbekovbelarysproject.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import java.util.Set;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder // Убрали отсюда @NotBlank и @Email
public class BekarysUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Username не может быть пустым") // Перенесли сюда
    @Column(unique = true, nullable = false)
    private String username;

    @NotBlank(message = "Пароль не может быть пустым")   // Добавили для надежности
    @Column(nullable = false)
    private String password;

    @NotBlank(message = "Email не может быть пустым")    // Перенесли сюда
    @Email(message = "Некорректный формат email")       // Перенесли сюда
    @Column(unique = true)
    private String email;

    @ElementCollection(fetch = FetchType.EAGER)
    private Set<String> roles;
}