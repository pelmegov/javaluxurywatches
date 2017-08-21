package ru.javaluxurywatches.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.javaluxurywatches.model.user.User;
import ru.javaluxurywatches.repository.user.UserRepository;
import ru.javaluxurywatches.service.system.MergeEntityManager;
import ru.javaluxurywatches.util.CommonUtil;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserService extends MergeEntityManager {

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

    public void update(User user) {
        if (user.isNew()) {
            toUpperCaseFirstChar(user);
            userRepository.save(user);
        } else {
            User currentUser = findById(user.getId());
            toUpperCaseFirstChar(currentUser);
            merge(user, currentUser);
        }
    }

    private void toUpperCaseFirstChar(User user) {
        user.setFirstName(CommonUtil.toUpperCaseFirstChar(user.getFirstName()));
        user.setLastName(CommonUtil.toUpperCaseFirstChar(user.getLastName()));
    }
}
