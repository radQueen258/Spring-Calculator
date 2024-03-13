package com.itis.calculatorspring.controllers;

import com.itis.calculatorspring.services.CalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CalculationController {

    @Autowired
    private CalculationService calculationService;




}
