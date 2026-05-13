package com.amirbekov.amirbekovbelarysproject.repository;

import com.amirbekov.amirbekovbelarysproject.entity.BekarysEnrollment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BekarysEnrollmentRepository extends JpaRepository<BekarysEnrollment, Long> {
}