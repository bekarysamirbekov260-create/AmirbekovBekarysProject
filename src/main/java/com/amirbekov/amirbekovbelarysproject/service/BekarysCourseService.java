package com.amirbekov.amirbekovbelarysproject.service;

import com.amirbekov.amirbekovbelarysproject.entity.BekarysCourse;
import com.amirbekov.amirbekovbelarysproject.repository.BekarysCourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import com.amirbekov.amirbekovbelarysproject.dto.BekarysCourseDTO;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BekarysCourseService {

    private final BekarysCourseRepository courseRepository;

    // Метод для получения всех курсов
    public List<BekarysCourse> getAllCourses() {
        return courseRepository.findAll();
    }

    // Метод для сохранения нового курса
    public BekarysCourse saveCourse(BekarysCourse course) {
        return courseRepository.save(course);
    }

    // Найти курс по ID
    public BekarysCourse getCourseById(Long id) {
        return courseRepository.findById(id).orElse(null);
    }

    public List<BekarysCourseDTO> getAllCoursesDTO() {
        return courseRepository.findAll().stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    private BekarysCourseDTO convertToDTO(BekarysCourse course) {
        BekarysCourseDTO dto = new BekarysCourseDTO();
        dto.setId(course.getId());
        dto.setTitle(course.getTitle());
        dto.setDescription(course.getDescription());
        dto.setPrice(course.getPrice());
        if (course.getAuthor() != null) {
            dto.setAuthorName(course.getAuthor().getUsername());
        }
        return dto;
    }
}