package com.amirbekov.amirbekovbelarysproject.controller;

import com.amirbekov.amirbekovbelarysproject.entity.BekarysCourse;
import com.amirbekov.amirbekovbelarysproject.service.BekarysCourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
@RequiredArgsConstructor
public class BekarysCourseController {

    private final BekarysCourseService courseService;

    // Получить список всех курсов: GET http://localhost:8080/api/courses
    @GetMapping
    public List<BekarysCourse> getAllCourses() {
        return courseService.getAllCourses();
    }

    // Добавить новый курс: POST http://localhost:8080/api/courses
    @PostMapping
    public ResponseEntity<BekarysCourse> createCourse(@RequestBody BekarysCourse course) {
        return ResponseEntity.ok(courseService.saveCourse(course));
    }
}