package ru.javaluxurywatches.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.javaluxurywatches.model.shop.Product;
import ru.javaluxurywatches.repository.shop.CategoryRepository;
import ru.javaluxurywatches.repository.shop.ItemRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ProductService {

    @Autowired
    private ItemRepository itemRepository;

    @Autowired
    private CategoryRepository categoryRepository;


    public List<Product> findItemByCategoriesAndId(String categoryLink, Long productId) {
        return itemRepository.findItemByCategoriesIsAndId(categoryRepository.findByLink(categoryLink), productId);
    }

    public List<Product> findItemByCategories(String categoryLink) {
        return itemRepository.findByCategoriesIs(categoryRepository.findByLink(categoryLink));
    }

}
