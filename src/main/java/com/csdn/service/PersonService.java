package com.csdn.service;

import com.csdn.dao.IPersonDao;
import com.csdn.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PersonService{
    @Autowired
    private IPersonDao personDao;

    public Person selectPerson(int id) {
        return personDao.selectPerson(id);
    }
}
