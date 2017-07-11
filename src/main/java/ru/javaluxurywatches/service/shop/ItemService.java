package ru.javaluxurywatches.service.shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import ru.javaluxurywatches.model.shop.Category;
import ru.javaluxurywatches.model.shop.Product;
import ru.javaluxurywatches.repository.shop.ItemRepository;

import javax.transaction.Transactional;
import java.util.Set;

@Service
@Transactional
public class ItemService {

    private final ItemRepository itemRepository;

    @Autowired
    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public Product findItemByCategoriesIsAndId(Category category, Long id) {
        return itemRepository.findItemByCategoriesIsAndId(category, id);
    }

    public Set<Product> findByCategoriesIs(Category category) {
        return itemRepository.findByCategoriesIs(category);
    }

    public Page<Product> findByCategoriesIs(Category category, Pageable pageable) {
        return itemRepository.findByCategoriesIs(category, pageable);
    }

    public Iterable<Product> findAll() {
        return itemRepository.findAll();
    }

}
