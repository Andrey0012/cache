package com.zaurtregulov.spring.springboot.stringboot_rest.controller;


import com.zaurtregulov.spring.springboot.stringboot_rest.entity.Element;
import com.zaurtregulov.spring.springboot.stringboot_rest.service.ElementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRESTController {

    @Autowired
    private ElementService elementService;

//    @GetMapping("/employees")
//    public List <Element> showAllEmployee () {
//      List<Element> allEmployees =  employeeService.getAllEmployees();
//      return allEmployees;
//    }
    @GetMapping("/cache/{id}")
    public Element getElement (@PathVariable int id) {
        Element element =elementService.getElement(id);

        return element;
    }
    @PostMapping ("/cache")
    public Element addNewEmployee (@RequestBody Element element) {
        elementService.saveElement(element);
        return element;
    }
    @PostMapping ("/cache/{id}")
    public Element addNewEmployee (@PathVariable int id,@RequestBody Element element ) {
        elementService.saveElement(element);
        return element;
    }

    @PutMapping ("/cache")
    public Element updateElement (@RequestBody Element element) {
        elementService.saveElement(element);
        return element;
    }
//    @DeleteMapping("/employees/{id}")
//    public String deleteEmployee (@PathVariable int id) {
//        Element employee=employeeService.getEmployee(id);
//
//        employeeService.deleteEmployee(id);
//        return "Element where ID = " + id + " delete";
//    }
}
