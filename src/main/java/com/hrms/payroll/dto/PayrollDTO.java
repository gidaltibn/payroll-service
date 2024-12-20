package com.hrms.payroll.dto;

public class PayrollDTO {
    private Long id;
    private Long employeeId; // Identificador do funcionário.
    private String payrollPeriod; // Período da folha, ex.: "Janeiro 2024".

    public PayrollDTO(Long id, Long employeeId, String payrollPeriod) {
        this.id = id;
        this.employeeId = employeeId;
        this.payrollPeriod = payrollPeriod;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getPayrollPeriod() {
        return payrollPeriod;
    }

    public void setPayrollPeriod(String payrollPeriod) {
        this.payrollPeriod = payrollPeriod;
    }
}
