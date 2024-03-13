package com.itis.calculatorspring.services;

import com.itis.calculatorspring.dto.UserForm;
import com.itis.calculatorspring.models.User;

public interface SignUpService {

    public User addUser (UserForm userForm);
}
