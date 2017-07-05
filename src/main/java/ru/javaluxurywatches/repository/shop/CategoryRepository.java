package ru.javaluxurywatches.repository.shop;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.javaluxurywatches.model.shop.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {

    @Query("select c from Category c where c.link=:link")
    Category findByLink(@Param("link") String link);
}
