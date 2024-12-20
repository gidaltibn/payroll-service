package com.hrms.payroll.repository;

import com.hrms.payroll.model.PayrollItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PayrollItemRepository extends JpaRepository<PayrollItem, Long> {
    // Métodos adicionais de consulta podem ser adicionados aqui, se necessário
}
