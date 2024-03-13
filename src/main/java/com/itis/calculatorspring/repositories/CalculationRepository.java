package com.itis.calculatorspring.repositories;

import com.itis.calculatorspring.models.Calculation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalculationRepository extends JpaRepository<Calculation, Long> {
}
