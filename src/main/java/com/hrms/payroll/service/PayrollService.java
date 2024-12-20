package com.hrms.payroll.service;

import com.hrms.payroll.dto.PayrollDTO;
import com.hrms.payroll.model.Payroll;
import com.hrms.payroll.repository.PayrollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PayrollService {

    private PayrollDTO convertEntityToDTO(Payroll payroll) {
        return new PayrollDTO(payroll.getId(), payroll.getEmployeeId(), payroll.getPayrollPeriod());
    }

    private Payroll convertDTOToEntity(PayrollDTO payrollDTO) {
        Payroll payroll = new Payroll();
        payroll.setId(payrollDTO.getId());
        payroll.setEmployeeId(payrollDTO.getEmployeeId());
        payroll.setPayrollPeriod(payrollDTO.getPayrollPeriod());
        return payroll;
    }

    // Add the methods here
    @Autowired
    private PayrollRepository payrollRepository;

    //Salvar uma folha de pagamento
    public PayrollDTO save(PayrollDTO payrollDTO) {
        Payroll payroll = convertDTOToEntity(payrollDTO);
        payroll = payrollRepository.save(payroll);
        return convertEntityToDTO(payroll);
    }

    //Buscar uma folha de pagamento pelo id
    public PayrollDTO findById(Long id) {
        Payroll payroll = payrollRepository.findById(id).orElse(null);
        if (payroll == null) {
            return null;
        }
        return convertEntityToDTO(payroll);
    }

    //Buscar lista de folhas de pagamento por employeeId
    public List<PayrollDTO> findByEmployeeId(Long employeeId) {
        List<Payroll> payrolls = payrollRepository.findByEmployeeId(employeeId);
        List<PayrollDTO> payrollDTOs = new ArrayList<>();
        for (Payroll payroll : payrolls) {
            payrollDTOs.add(convertEntityToDTO(payroll));
        }
        return payrollDTOs;
    }

    //Atualizar uma folha de pagamento
    public PayrollDTO update(PayrollDTO payrollDTO) {
        Payroll payroll = convertDTOToEntity(payrollDTO);
        payroll = payrollRepository.save(payroll);
        return convertEntityToDTO(payroll);
    }

    //Deletar uma folha de pagamento
    public void delete(Long id) {
        payrollRepository.deleteById(id);
    }
}
