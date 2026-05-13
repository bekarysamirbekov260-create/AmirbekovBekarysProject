package com.amirbekov.amirbekovbelarysproject.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "enrollments")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BekarysEnrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private BekarysUser student;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private BekarysCourse course;

    private LocalDateTime enrollmentDate;
}