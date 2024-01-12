package vn.vti.bds.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.vti.bds.models.User;
import vn.vti.bds.repositories.UserRepository;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    public User createUser(User user) {
        return userRepository.save(user);
    }
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
    // Add more methods as per your requirements
}