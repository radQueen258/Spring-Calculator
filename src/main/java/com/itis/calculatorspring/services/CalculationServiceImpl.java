package com.itis.calculatorspring.services;

import com.itis.calculatorspring.models.Calculation;
import com.itis.calculatorspring.repositories.CalculationRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Date;

public class CalculationServiceImpl implements CalculationService{

    @Autowired
    public CalculationRepository calculationRepository;
    @Override
    public Calculation add(double a, double b, Long userId) {
        Calculation calculation = new Calculation();
        calculation.setUserId(userId);
        calculation.setExpression(a + " + " + b);
        calculation.setResult(a + b);
//        calculation.setTimestamp(new Date());
        return calculationRepository.save(calculation);
    }

    @Override
    public Calculation subtract(double a, double b, Long userId) {
        Calculation calculation = new Calculation();
        calculation.setUserId(userId);
        calculation.setExpression(a + " - " + b);
        calculation.setResult(a - b);
//        calculation.setTimestamp(new Date());
        return calculationRepository.save(calculation);
    }

    @Override
    public Calculation multiply(double a, double b, Long userId) {
        Calculation calculation = new Calculation();
        calculation.setUserId(userId);
        calculation.setExpression(a + " * " + b);
        calculation.setResult(a * b);
//        calculation.setTimestamp(new Date());
        return calculationRepository.save(calculation);
    }

    @Override
    public Calculation divide(double a, double b, Long userId) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        Calculation calculation = new Calculation();
        calculation.setUserId(userId);
        calculation.setExpression(a + " / " + b);
        calculation.setResult(a / b);
//        calculation.setTimestamp(new Date());
        return calculationRepository.save(calculation);
    }

    @Override
    public Calculation power(double a, double b, Long userId) {
        Calculation calculation = new Calculation();
        calculation.setUserId(userId);
        calculation.setExpression(a + " ^ " + b);
        calculation.setResult(Math.pow(a, b));
//        calculation.setTimestamp(new Dta);
        return calculationRepository.save(calculation);
    }

    @Override
    public Calculation squareRoot(double a, double b, Long userId) {
        if (a < 0) {
            throw new IllegalArgumentException("Square root of negative number is not allowed.");
        }
        Calculation calculation = new Calculation();
        calculation.setUserId(userId);
        calculation.setExpression("sqrt(" + a + ")");
        calculation.setResult(Math.sqrt(a));
//        calculation.setTimestamp(new Date());
        return calculationRepository.save(calculation);
    }
}
