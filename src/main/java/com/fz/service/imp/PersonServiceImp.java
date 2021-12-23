package com.fz.service.imp;

import com.fz.dao.PersonDao;
import com.fz.entity.Person;
import com.fz.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PersonServiceImp implements PersonService {

    final
    PersonDao personDao;

    public PersonServiceImp(PersonDao personDao) {
        this.personDao = personDao;
    }

    @Override
    public List<Person> findPersonAll() {
        return    personDao.findPersonAll();
    }
}
