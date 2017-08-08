package ru.javaluxurywatches.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.javaluxurywatches.model.user.User;
import ru.javaluxurywatches.repository.user.UserRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.lang.reflect.Field;
import java.util.List;

@Service
@Transactional
public class UserService {

    @PersistenceContext
    private EntityManager em;

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findByLastName(String lastName) {
        return userRepository.findByLastName(lastName);
    }

    public List<User> findByFirstName(String firstName) {
        return userRepository.findByFirstName(firstName);
    }

    public User findById(Long id) {
        return userRepository.findById(id);
    }

    public User findByLogin(String login) {
        return userRepository.findByLogin(login);
    }

    public Iterable<User> findAll() {
        return userRepository.findAll();
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    @SuppressWarnings("unchecked")
    public void merge(User user) {
        if (user.isNew()) {
            em.persist(user);
        } else {
            User currentUser = findById(user.getId());
            User updateUser = new User();
            Field[] fields = User.class.getDeclaredFields();
            for (Field field : fields) {
                field.setAccessible(true);
                try {
                    Object value1 = field.get(user);
                    Object value2 = field.get(currentUser);
                    Object value = (value1 != null && !value1.equals("")) ? value1 : value2;
                    field.set(updateUser, value);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
            em.merge(updateUser);
        }
    }
}
