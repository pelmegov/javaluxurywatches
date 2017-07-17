package ru.javaluxurywatches.service.shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import ru.javaluxurywatches.model.shop.Category;
import ru.javaluxurywatches.model.shop.Product;
import ru.javaluxurywatches.repository.shop.ProductRepository;

import javax.transaction.Transactional;
import java.util.Set;

@Service
@Transactional
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product findProductByCategoriesIsAndId(Category category, Long id) {
        return productRepository.findProductByCategoriesIsAndId(category, id);
    }

    public Set<Product> findByCategoriesIs(Category category) {
        return productRepository.findByCategoriesIs(category);
    }

    public Page<Product> findByCategoriesIs(Category category, Pageable pageable) {
        return productRepository.findByCategoriesIs(category, pageable);
    }

    public Iterable<Product> findAll() {
        return productRepository.findAll();
    }

    public Iterable<Product> findForIndex(Integer indexProducts) {
        Pageable pageable = new PageRequest(0, indexProducts);
        return productRepository.findAll(pageable).getContent();
    }

    public Iterable<Product> findHitsForIndex() {
        Pageable pageable = new PageRequest(0, 4);
        return productRepository.findItemByIsHit(true, pageable).getContent();
    }
}
