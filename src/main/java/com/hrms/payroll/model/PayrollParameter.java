package com.hrms.payroll.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
public class PayrollParameter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal inssRate; // Alíquota de INSS.

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal overtimeRate50; // Taxa de horas extras (50%).

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal overtimeRate100; // Taxa de horas extras (100%).

}