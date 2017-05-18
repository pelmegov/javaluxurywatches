package ru.javaluxurywatches.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import ru.javaluxurywatches.model.shop.Category;
import ru.javaluxurywatches.repository.shop.CategoryRepository;

public class ModelAttrConfig {

    @Autowired
    private CategoryRepository categoryRepository;

    @ModelAttribute("categories")
    public Iterable<Category> getCategories() {
        return categoryRepository.findAll();
    }

}
