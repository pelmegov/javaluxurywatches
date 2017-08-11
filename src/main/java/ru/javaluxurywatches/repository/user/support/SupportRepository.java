package ru.javaluxurywatches.repository.user.support;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.javaluxurywatches.model.user.profile.Support;

import java.util.List;

@Repository
public interface SupportRepository extends CrudRepository<Support, Long> {

    Support findById(Long id);

    List<Support> findAllByUserId(Long id);
}
