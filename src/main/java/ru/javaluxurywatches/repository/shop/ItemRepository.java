package ru.javaluxurywatches.repository.shop;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.javaluxurywatches.model.shop.Category;
import ru.javaluxurywatches.model.shop.Product;

import java.util.List;
import java.util.Set;

@Repository
public interface ItemRepository extends CrudRepository<Product, Long> {

    @Query("select c.product_id, c.category_id from category_product c where c.category_id=:category_id" +
            " and c.product_id=:product_id")
    List<Product> findItemByCategoriesIsAndId(@Param("category_id") Category category, @Param("product_id") Long id);

    @Query("select p.categories from Product p where p.categories = :category ")
    List<Product> findByCategoriesIs(@Param("category") Category category);
}
