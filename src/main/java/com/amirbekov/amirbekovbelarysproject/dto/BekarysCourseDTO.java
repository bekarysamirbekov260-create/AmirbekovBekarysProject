package com.amirbekov.amirbekovbelarysproject.dto;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class BekarysCourseDTO {
    private Long id;
    private String title;
    private String description;
    private BigDecimal price;
    private String authorName; // Вместо всего объекта автора только его имя
}