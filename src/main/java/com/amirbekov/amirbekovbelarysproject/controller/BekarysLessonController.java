package com.amirbekov.amirbekovbelarysproject.controller;

import com.amirbekov.amirbekovbelarysproject.entity.BekarysLesson;
import com.amirbekov.amirbekovbelarysproject.service.BekarysLessonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/lessons")
@RequiredArgsConstructor
public class BekarysLessonController {
    private final BekarysLessonService lessonService;

    @GetMapping
    public List<BekarysLesson> getAllLessons() {
        return lessonService.getLessonsByCourseId(null);
    }
}