package ru.javaluxurywatches.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.javaluxurywatches.model.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
