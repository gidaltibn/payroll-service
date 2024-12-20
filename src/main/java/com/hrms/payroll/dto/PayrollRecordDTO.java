package com.hrms.payroll.dto;

import com.hrms.payroll.model.PayrollPeriod;

public class PayrollRecordDTO {
    private Long id;
    private Long employeeId; // Identificador do funcionário.
    private PayrollPeriod payrollPeriod; // Período de folha de pagamento.
    private String recordDetails; // Detalhes do registro (opcional).
    private String status; // Status do registro ("Pendente", "Pago").

    public PayrollRecordDTO(Long id, Long employeeId, PayrollPeriod payrollPeriod, String recordDetails, String status) {
        this.id = id;
        this.employeeId = employeeId;
        this.payrollPeriod = payrollPeriod;
        this.recordDetails = recordDetails;
        this.status = status;
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

    public PayrollPeriod getPayrollPeriod() {
        return payrollPeriod;
    }

    public void setPayrollPeriod(PayrollPeriod payrollPeriod) {
        this.payrollPeriod = payrollPeriod;
    }

    public String getRecordDetails() {
        return recordDetails;
    }

    public void setRecordDetails(String recordDetails) {
        this.recordDetails = recordDetails;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
