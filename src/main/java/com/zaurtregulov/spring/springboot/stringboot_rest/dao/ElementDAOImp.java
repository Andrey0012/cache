package com.zaurtregulov.spring.springboot.stringboot_rest.dao;


import com.zaurtregulov.spring.springboot.stringboot_rest.entity.Element;
//import org.hibernate.Session;
//import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;
@Repository
public class ElementDAOImp implements ElementDAO {
    @Autowired
    public EntityManager entityManager;



    @Override
    public void saveEmployee(Element element) {
//        Session session =entityManager.unwrap(Session.class);
//        session.saveOrUpdate(employee);


        Element newElement = entityManager.merge(element);
        element.setId(newElement.getId());
    }

    @Override
    public Element getElement(int id) {
//        Session session =entityManager.unwrap(Session.class);
//        Element employee = session.get(Element.class, id);

      Element element = entityManager.find(Element.class, id);
        return element;
    }
}
