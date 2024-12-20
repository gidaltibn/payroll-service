package com.hrms.payroll.dto;

import java.time.LocalDate;

public class PayrollPeriodDTO {
    private Long id;
    private String periodName; // Nome descritivo do período (ex.: "Janeiro 2024").
    private LocalDate startDate; // Data de início do período
    private LocalDate endDate; // Data de término do período.
    private String status; // Status do período ("Aberto", "Fechado").

    public PayrollPeriodDTO(Long id, String periodName, LocalDate startDate, LocalDate endDate, String status) {
        this.id = id;
        this.periodName = periodName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPeriodName() {
        return periodName;
    }

    public void setPeriodName(String periodName) {
        this.periodName = periodName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
