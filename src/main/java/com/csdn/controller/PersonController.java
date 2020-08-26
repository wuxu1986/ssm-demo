package com.csdn.controller;

import com.csdn.domain.Person;
import com.csdn.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonService personService;

    @RequestMapping("/query")
    public ModelAndView query(String id) throws Exception {
        ModelAndView mv = new ModelAndView();
        Person person = personService.selectPerson(Integer.getInteger(id));
        mv.addObject("person", person);
        mv.setViewName("person");
        return mv;
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String id() throws Exception {
        return "hello";
    }
}












