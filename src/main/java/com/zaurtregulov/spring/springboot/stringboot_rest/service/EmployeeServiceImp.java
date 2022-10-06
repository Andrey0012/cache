package com.zaurtregulov.spring.springboot.stringboot_rest.service;


import com.zaurtregulov.spring.springboot.stringboot_rest.dao.EmployeeDAO;
import com.zaurtregulov.spring.springboot.stringboot_rest.entity.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImp implements EmployeeService{
    @Autowired
    private final EmployeeDAO employeeDAO;

    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }

    @Override
    @Transactional
    public void saveEmployee(Employee employee) {
         employeeDAO.saveEmployee(employee);
    }

    @Override
    @Transactional
    public Employee getEmployee(int id) {
        return employeeDAO.getEmployee(id);
    }

    @Override
    @Transactional
    public void deleteEmployee(int id) {
        employeeDAO.deleteEmployee (id);
    }
}
