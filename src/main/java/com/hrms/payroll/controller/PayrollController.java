package com.hrms.payroll.controller;

import com.hrms.payroll.client.AuthClient;
import com.hrms.payroll.dto.PayrollDTO;
import com.hrms.payroll.model.Payroll;
import com.hrms.payroll.service.PayrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/payrolls")
public class PayrollController {
    @Autowired
    private PayrollService payrollService;

    @Autowired
    private AuthClient authClient;

    @PostMapping
    public ResponseEntity<PayrollDTO> save(@RequestBody PayrollDTO payrollDTO, @RequestHeader("Authorization") String token) {
        if (authClient.validateToken(token).getStatusCode().is2xxSuccessful()) {
            return ResponseEntity.ok(payrollService.save(payrollDTO));
        } else {
            return ResponseEntity.status(403).build();
        }
    }
}
