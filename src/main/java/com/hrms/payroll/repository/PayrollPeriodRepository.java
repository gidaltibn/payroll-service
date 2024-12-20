package com.hrms.payroll.repository;

import com.hrms.payroll.model.PayrollPeriod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PayrollPeriodRepository extends JpaRepository<PayrollPeriod, Long> {
    // Métodos adicionais de consulta podem ser adicionados aqui, se necessário
}
