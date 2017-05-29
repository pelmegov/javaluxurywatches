package ru.javaluxurywatches.repository.shop;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.javaluxurywatches.model.shop.Category;
import ru.javaluxurywatches.model.shop.Product;

@Repository
public interface ItemRepository extends CrudRepository<Product, Long> {
    Product findItemByCategoriesIsAndId(Category category, Long id);
}
