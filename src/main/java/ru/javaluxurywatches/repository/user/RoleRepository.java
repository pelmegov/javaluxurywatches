package ru.javaluxurywatches.repository.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.javaluxurywatches.model.user.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
}
