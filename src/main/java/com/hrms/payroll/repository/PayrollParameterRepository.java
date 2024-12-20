package com.hrms.payroll.repository;

import com.hrms.payroll.model.PayrollParameter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PayrollParameterRepository extends JpaRepository<PayrollParameter, Long> {
    // Métodos adicionais de consulta podem ser adicionados aqui, se necessário
}
