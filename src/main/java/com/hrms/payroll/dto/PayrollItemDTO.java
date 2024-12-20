package com.hrms.payroll.dto;

import java.math.BigDecimal;

public class PayrollItemDTO {
    private Long id;
    private String description; // Descrição do item (ex.: "Salário Base").
    private BigDecimal amount; // Valor (positivo ou negativo).

    public PayrollItemDTO(Long id, String description, BigDecimal amount) {
        this.id = id;
        this.description = description;
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
