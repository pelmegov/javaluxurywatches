package ru.javaluxurywatches.controller;

import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.javaluxurywatches.model.shop.Product;
import ru.javaluxurywatches.repository.shop.CategoryRepository;
import ru.javaluxurywatches.repository.shop.ItemRepository;

@Controller
public class ProductController {

    private interface Attr {
        String PRODUCTS = "products";
        String PRODUCT = "product";
        String CURRENT_PAGE = "currentPage";
        String IS_FIRST_PAGE = "isFirstPage";
        String IS_LAST_PAGE = "isLastPage";
        String CATEGORY_LINK = "categoryLink";
    }

    final private ItemRepository itemRepository;
    final private CategoryRepository categoryRepository;

    @Autowired
    public ProductController(ItemRepository itemRepository, CategoryRepository categoryRepository) {
        this.itemRepository = itemRepository;
        this.categoryRepository = categoryRepository;
    }

    @RequestMapping(value = "/category/{categoryLink}/{productId}")
    public String detailProductPage(
            @NonNull @PathVariable("categoryLink") String categoryLink,
            @NonNull @PathVariable("productId") Long productId,
            Model model) {
        model.addAttribute(Attr.PRODUCT,
                itemRepository.findItemByCategoriesIsAndId(categoryRepository.findByLink(categoryLink), productId));
        return "shop/product";
    }

    @RequestMapping(value = "/category/{categoryLink}")
    public String detailProductPage(
            @NonNull @PathVariable("categoryLink") String categoryLink,
            Model model,
            Pageable pageable) {
        Page<Product> products = itemRepository.findByCategoriesIs(categoryRepository.findByLink(categoryLink), pageable);
        model.addAttribute(Attr.PRODUCTS, products.getContent());
        model.addAttribute(Attr.CURRENT_PAGE, pageable.getPageNumber());
        model.addAttribute(Attr.IS_FIRST_PAGE, products.isFirst());
        model.addAttribute(Attr.IS_LAST_PAGE, products.isLast());
        model.addAttribute(Attr.CATEGORY_LINK, categoryLink);
        return "shop/products";
    }

}
