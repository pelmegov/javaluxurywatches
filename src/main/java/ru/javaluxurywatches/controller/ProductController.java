package ru.javaluxurywatches.controller;

import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.javaluxurywatches.config.ModelAttrConfig;
import ru.javaluxurywatches.repository.shop.CategoryRepository;
import ru.javaluxurywatches.repository.shop.ItemRepository;

@Controller
public class ProductController extends ModelAttrConfig {

    final private ItemRepository itemRepository;
    final private CategoryRepository categoryRepository;

    @Autowired
    public ProductController(ItemRepository itemRepository, CategoryRepository categoryRepository) {
        this.itemRepository = itemRepository;
        this.categoryRepository = categoryRepository;
    }

    @RequestMapping(value = "/category/{categoryLink}/{itemId}")
    public String product(
            @NonNull @PathVariable("categoryLink") String categoryLink,
            @NonNull @PathVariable("itemId") Long itemId,
            Model model) {
        model.addAttribute("product",
                itemRepository.findItemByCategoriesIsAndId(categoryRepository.findByLink("/" + categoryLink), itemId));
        return "product";
    }

}
