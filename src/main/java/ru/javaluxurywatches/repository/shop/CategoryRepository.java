package ru.javaluxurywatches.repository.shop;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.javaluxurywatches.model.shop.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
