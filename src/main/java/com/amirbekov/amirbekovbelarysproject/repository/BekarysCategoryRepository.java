package com.amirbekov.amirbekovbelarysproject.repository;

import com.amirbekov.amirbekovbelarysproject.entity.BekarysCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BekarysCategoryRepository extends JpaRepository<BekarysCategory, Long> {
}