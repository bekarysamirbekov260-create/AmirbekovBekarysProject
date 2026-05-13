package com.amirbekov.amirbekovbelarysproject.service;

import com.amirbekov.amirbekovbelarysproject.entity.BekarysEnrollment;
import com.amirbekov.amirbekovbelarysproject.repository.BekarysEnrollmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class BekarysEnrollmentService {
    private final BekarysEnrollmentRepository enrollmentRepository;

    public BekarysEnrollment enrollStudent(BekarysEnrollment enrollment) {
        enrollment.setEnrollmentDate(LocalDateTime.now());
        return enrollmentRepository.save(enrollment);
    }
}