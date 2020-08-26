package com.csdn.dao;

import com.csdn.domain.Person;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonDao {
    Person selectPerson(int id);
}
