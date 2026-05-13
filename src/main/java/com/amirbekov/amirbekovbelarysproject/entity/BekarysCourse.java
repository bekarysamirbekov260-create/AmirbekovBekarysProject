package com.amirbekov.amirbekovbelarysproject.entity;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;

@Entity
@Table(name = "courses")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BekarysCourse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(length = 1000)
    private String description;

    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private com.amirbekov.amirbekovbelarysproject.entity.BekarysUser author; // Автор курса — это пользователь

    @ManyToOne
    @JoinColumn(name = "category_id")
    private BekarysCategory category;
}