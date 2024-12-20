package com.hrms.payroll.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
public class PayrollPeriod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String periodName; // Nome descritivo do período (ex.: "Janeiro 2024").

    @Column(nullable = false)
    private LocalDate startDate; // Data de início do período.

    @Column(nullable = false)
    private LocalDate endDate; // Data de término do período.

    @Column(nullable = false)
    private String status; // Status do período ("Aberto", "Fechado").

}
