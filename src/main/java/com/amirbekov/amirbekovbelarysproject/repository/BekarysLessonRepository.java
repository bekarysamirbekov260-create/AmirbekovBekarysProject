package com.amirbekov.amirbekovbelarysproject.repository;

import com.amirbekov.amirbekovbelarysproject.entity.BekarysLesson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BekarysLessonRepository extends JpaRepository<BekarysLesson, Long> {
}