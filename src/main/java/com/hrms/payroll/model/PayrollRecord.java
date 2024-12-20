package com.hrms.payroll.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class PayrollRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long employeeId; // Identificador do funcionário.

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "payroll_period_id", nullable = false)
    private PayrollPeriod payrollPeriod; // Período de folha de pagamento.

    @Column(length = 500)
    private String recordDetails; // Detalhes do registro (opcional).

    @Column(nullable = false)
    private String status; // Status do registro ("Pendente", "Pago").
}
