package ru.javaluxurywatches.repository.shop;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.javaluxurywatches.model.shop.Item;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {
}
