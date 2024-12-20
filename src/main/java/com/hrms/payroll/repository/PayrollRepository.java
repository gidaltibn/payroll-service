package com.hrms.payroll.repository;

import com.hrms.payroll.model.Payroll;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PayrollRepository extends JpaRepository<Payroll, Long> {
    List<Payroll> findByEmployeeId(Long employeeId);
    // Métodos adicionais de consulta podem ser adicionados aqui, se necessário
}