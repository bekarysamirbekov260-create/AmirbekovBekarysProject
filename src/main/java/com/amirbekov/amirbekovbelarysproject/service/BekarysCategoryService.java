package com.amirbekov.amirbekovbelarysproject.service;

import com.amirbekov.amirbekovbelarysproject.entity.BekarysCategory;
import com.amirbekov.amirbekovbelarysproject.repository.BekarysCategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BekarysCategoryService {
    private final BekarysCategoryRepository categoryRepository;

    public List<BekarysCategory> getAllCategories() {
        return categoryRepository.findAll();
    }

    public BekarysCategory saveCategory(BekarysCategory category) {
        return categoryRepository.save(category);
    }
}