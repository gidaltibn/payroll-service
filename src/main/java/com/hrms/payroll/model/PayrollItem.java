package com.hrms.payroll.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
public class PayrollItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description; // Descrição do item (ex.: "Salário Base").

    private BigDecimal amount; // Valor (positivo ou negativo).

    @ManyToOne
    @JoinColumn(name = "payroll_id")
    private Payroll payroll; // Folha de pagamento associada.

}
