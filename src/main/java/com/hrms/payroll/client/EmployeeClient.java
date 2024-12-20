package com.hrms.payroll.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "employee-service", url = "http://localhost:8080/employees")
public interface EmployeeClient {

    @GetMapping("/{id}/exists")
    boolean existsById(
            @PathVariable("id") Long employeeId,
            @RequestHeader("Authorization") String token
    );


}
