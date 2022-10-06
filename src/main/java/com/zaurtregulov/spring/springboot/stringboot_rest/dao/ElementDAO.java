package com.zaurtregulov.spring.springboot.stringboot_rest.dao;



import com.zaurtregulov.spring.springboot.stringboot_rest.entity.Element;

import java.util.List;

public interface ElementDAO {
    public void saveEmployee(Element element);
    public Element getElement (int id);
}

