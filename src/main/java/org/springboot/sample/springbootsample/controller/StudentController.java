package org.springboot.sample.springbootsample.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springboot.sample.springbootsample.entity.Student;
import org.springboot.sample.springbootsample.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/stu")
@RestController
public class StudentController {

    private final static Logger log = LoggerFactory.getLogger(StudentController.class);

    @Autowired
    private StudentService studentService;


    @RequestMapping("/list")
    public List<Student> getStus(){

        log.info("从数据库读取Student集合");
        return studentService.getList();

    }


}
