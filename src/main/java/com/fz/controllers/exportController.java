package com.fz.controllers;

import com.fz.entity.Person;
import com.fz.service.ExportService;
import com.fz.utility.ExportExcel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class exportController {

    final
    ExportService exportService;

    public exportController(ExportService exportService) {
        this.exportService = exportService;
    }

    @ResponseBody
    @RequestMapping("export")
    public void export(HttpServletRequest request, HttpServletResponse response) {
        Person encrypt = new Person();//创建实体类对象
        List<Person> encryptList = exportService.export(encrypt);
        ExportExcel<Person> ee= new ExportExcel<Person>();
        String[] headers = {"pid","pname","page"};
        String fileName = "aa";
        ee.exportExcel(headers,encryptList,fileName,response);
    }

}
