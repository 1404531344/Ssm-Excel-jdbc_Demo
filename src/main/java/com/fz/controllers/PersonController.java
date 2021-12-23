package com.fz.controllers;

import com.fz.entity.Person;
import com.fz.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PersonController {

final
PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }


    @ResponseBody
    @RequestMapping("findPersonAll")
    public List<Person> findPersonAll(){
        System.out.println("查询所欧");
        return personService.findPersonAll();
    }

}
