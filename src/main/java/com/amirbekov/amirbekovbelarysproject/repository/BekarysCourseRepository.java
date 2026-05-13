package com.amirbekov.amirbekovbelarysproject.repository;

import com.amirbekov.amirbekovbelarysproject.entity.BekarysCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BekarysCourseRepository extends JpaRepository<BekarysCourse, Long> {
}