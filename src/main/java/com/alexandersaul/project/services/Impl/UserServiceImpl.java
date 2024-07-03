package com.alexandersaul.project.services.Impl;

import com.alexandersaul.project.models.User;
import com.alexandersaul.project.repositories.UserRepository;
import com.alexandersaul.project.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;



import java.util.Optional;

public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public void registerUser(String userName, String password) {
        User newUser = new User();
        newUser.setUserName(userName);
        newUser.setPassword(password);
        userRepository.save(newUser);
    }

    @Override
    public User authenticaUser(String userName, String password) {

        Optional<User> userOptional = userRepository.findByUserName(userName);

        if (userOptional.isPresent()) {
            User user = userOptional.get();
            BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
            if (passwordEncoder.matches(password, user.getPassword())) {
                return user;
            }
        }

        return null;

    }
}
