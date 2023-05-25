package com.dushi.ems.controller;

import com.dushi.ems.model.Employee;

import com.dushi.ems.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/create")
    // @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Employee createStudent(@RequestBody Employee employee){
        return employeeService.save(employee);
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<Employee> fetchEmployeeById(@PathVariable int id){
        Employee employee= employeeService.findById(id);
        if(employee==null){
            return ResponseEntity.notFound().build();
        }
        else{
            return ResponseEntity.ok().body(employee);
        }
    }
}
