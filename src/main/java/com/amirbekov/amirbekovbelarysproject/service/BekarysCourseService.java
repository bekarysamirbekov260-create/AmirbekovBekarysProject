package com.amirbekov.amirbekovbelarysproject.service;

import com.amirbekov.amirbekovbelarysproject.entity.BekarysCourse;
import com.amirbekov.amirbekovbelarysproject.repository.BekarysCourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

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
}