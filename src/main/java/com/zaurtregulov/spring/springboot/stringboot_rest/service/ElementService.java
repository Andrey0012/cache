package com.zaurtregulov.spring.springboot.stringboot_rest.service;



import com.zaurtregulov.spring.springboot.stringboot_rest.entity.Element;

import java.util.List;

public interface ElementService {
    public void saveElement(Element element);

    public Element getElement (int id);
}
