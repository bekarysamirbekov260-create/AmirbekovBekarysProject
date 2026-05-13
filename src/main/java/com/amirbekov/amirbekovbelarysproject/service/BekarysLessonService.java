package com.amirbekov.amirbekovbelarysproject.service;

import com.amirbekov.amirbekovbelarysproject.entity.BekarysLesson;
import com.amirbekov.amirbekovbelarysproject.repository.BekarysLessonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BekarysLessonService {
    private final BekarysLessonRepository lessonRepository;

    public List<BekarysLesson> getLessonsByCourseId(Long courseId) {
        // Позже можно добавить фильтрацию по ID курса в репозиторий
        return lessonRepository.findAll();
    }

    public BekarysLesson saveLesson(BekarysLesson lesson) {
        return lessonRepository.save(lesson);
    }
}