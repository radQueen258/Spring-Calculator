package com.itis.calculatorspring.services;

import com.itis.calculatorspring.dto.UserForm;
import com.itis.calculatorspring.models.User;
import com.itis.calculatorspring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SignUpServiceImpl implements SignUpService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User addUser(UserForm userForm) {
        User user = User.builder()
                .username(userForm.getName())
                .password(userForm.getPassword())
                .build();

        return userRepository.save(user);
    }
}


//    public User register(User user) {
//        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//        String hashedPassword = passwordEncoder.encode(user.getPassword());
//        user.setPassword(hashedPassword);
//        return userRepository.save(user);
//    }

