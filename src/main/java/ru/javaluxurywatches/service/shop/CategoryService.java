package ru.javaluxurywatches.service.shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.javaluxurywatches.model.shop.Category;
import ru.javaluxurywatches.repository.shop.CategoryRepository;

import javax.transaction.Transactional;

@Service
@Transactional
public class CategoryService {

    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public Category findByLink(String link) {
        return categoryRepository.findByLink(link);
    }

    public Iterable<Category> findAll() {
        return categoryRepository.findAll();
    }

}
