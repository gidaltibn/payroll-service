package com.hrms.payroll.repository;

import com.hrms.payroll.model.PayrollRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PayrollRecordRepository extends JpaRepository<PayrollRecord, Long> {

}
