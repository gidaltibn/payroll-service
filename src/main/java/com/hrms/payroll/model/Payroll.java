package com.hrms.payroll.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Payroll {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long employeeId; // Identificador do funcionário.

    private String payrollPeriod; // Período da folha, ex.: "Janeiro 2024".

    @OneToMany(mappedBy = "payroll", cascade = CascadeType.ALL)
    private List<PayrollItem> items; // Detalhes da folha.

    // Getters, Setters e Construtores
}
