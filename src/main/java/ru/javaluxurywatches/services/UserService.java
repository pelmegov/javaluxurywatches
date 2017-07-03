package ru.javaluxurywatches.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.javaluxurywatches.model.user.User;
import ru.javaluxurywatches.repository.user.UserRepository;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Iterable<User> getAll(){
        return userRepository.findAll();
    }

    public User getByLogin(String login){
        return userRepository.findByLogin(login);
    }

    public User saveUser(User user){
        return userRepository.save(user);
    }
}
