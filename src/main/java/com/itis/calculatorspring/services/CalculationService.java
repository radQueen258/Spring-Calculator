package com.itis.calculatorspring.services;

import com.itis.calculatorspring.models.Calculation;

public interface CalculationService {

    Calculation add (double a, double b, Long userId);

    Calculation subtract (double a, double b, Long userId);

    Calculation multiply (double a, double b, Long userId);
    Calculation divide (double a, double b, Long userId);
    Calculation power (double a, double b, Long userId);
    Calculation squareRoot (double a, double b, Long userId);

}
