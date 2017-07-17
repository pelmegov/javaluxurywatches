package ru.javaluxurywatches.repository.shop;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import ru.javaluxurywatches.model.shop.Category;
import ru.javaluxurywatches.model.shop.Product;

import java.util.Set;

@Repository
public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {
    Product findProductByCategoriesIsAndId(Category category, Long id);
    Set<Product> findByCategoriesIs(Category category);
    Page<Product> findByCategoriesIs(Category category, Pageable pageable);
    Page<Product> findItemByIsHit(Boolean isHit, Pageable pageable);
}
