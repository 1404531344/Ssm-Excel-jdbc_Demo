package com.fz.service.imp;

import com.fz.dao.ExportDao;
import com.fz.entity.Person;
import com.fz.service.ExportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class ExportServiceImp implements ExportService {


    final
    ExportDao exportDao;

    public ExportServiceImp(ExportDao exportDao) {
        this.exportDao = exportDao;
    }


    @Override
    public List<Person> export(Person person) {
        return  exportDao.export(person);
    }
}
