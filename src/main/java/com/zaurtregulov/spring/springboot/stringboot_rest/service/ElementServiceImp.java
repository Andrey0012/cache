package com.zaurtregulov.spring.springboot.stringboot_rest.service;


import com.zaurtregulov.spring.springboot.stringboot_rest.dao.ElementDAO;
import com.zaurtregulov.spring.springboot.stringboot_rest.entity.Element;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ElementServiceImp implements ElementService {
    @Autowired
    private final ElementDAO elementDAO;


    @Override
    @Transactional
    public void saveElement (Element employee) {
         elementDAO.saveEmployee(employee);
    }

    @Override
    @Transactional
    public Element getElement(int id) {
        return elementDAO.getElement(id);
    }

}
