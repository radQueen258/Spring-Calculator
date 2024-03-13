package com.itis.calculatorspring.controllers;

import ch.qos.logback.core.model.Model;
import com.itis.calculatorspring.dto.UserForm;
import com.itis.calculatorspring.models.User;
import com.itis.calculatorspring.services.SignUpService;
import com.itis.calculatorspring.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {


//    @Autowired
//    private SignUpService signUpService;
//
//
//    @GetMapping("/register")
//    public String register() {
//        return "register";
//    }
//
//    @PostMapping("/register")
//    public String registerUser(@RequestParam String name, @RequestParam String password, Model model) {
//        UserForm userForm = new UserForm();
//
//        userForm.setName(name);
//        userForm.setPassword(password);
//        signUpService.addUser(userForm);
//        model.addText("User registered successfully");
//        return "register";
//    }
//
//    @GetMapping("/login")
//    public String login() {
//        return "login";
//    }
}
