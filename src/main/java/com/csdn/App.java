package com.csdn;

import com.csdn.service.PersonService;

public class App {

    public static void main(String[] args) {
        System.out.println(new PersonService().selectPerson(2));
    }
}
