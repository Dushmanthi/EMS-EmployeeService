package com.dushi.ems.service;

import com.dushi.ems.model.Employee;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

public interface EmployeeService {
    public Employee save(Employee employee);
    public Employee findById(int id);

}
