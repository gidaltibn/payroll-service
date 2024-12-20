package com.hrms.payroll.dto;

import java.math.BigDecimal;

public class PayrollParameterDTO {
    private Long id;
    private BigDecimal inssRate; // Alíquota de INSS.
    private BigDecimal overtimeRate50; // Taxa de horas extras (50%).
    private BigDecimal overtimeRate100; // Taxa de horas extras (100%).

    public PayrollParameterDTO(Long id, BigDecimal inssRate, BigDecimal overtimeRate50, BigDecimal overtimeRate100) {
        this.id = id;
        this.inssRate = inssRate;
        this.overtimeRate50 = overtimeRate50;
        this.overtimeRate100 = overtimeRate100;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getInssRate() {
        return inssRate;
    }

    public void setInssRate(BigDecimal inssRate) {
        this.inssRate = inssRate;
    }

    public BigDecimal getOvertimeRate50() {
        return overtimeRate50;
    }

    public void setOvertimeRate50(BigDecimal overtimeRate50) {
        this.overtimeRate50 = overtimeRate50;
    }

    public BigDecimal getOvertimeRate100() {
        return overtimeRate100;
    }

    public void setOvertimeRate100(BigDecimal overtimeRate100) {
        this.overtimeRate100 = overtimeRate100;
    }
}
