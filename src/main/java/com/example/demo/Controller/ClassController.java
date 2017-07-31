package com.example.demo.Controller;

import com.example.demo.Service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.reflect.generics.repository.ClassRepository;

import java.util.List;

/**
 * Created by Think on 2017/7/30.
 */
@RestController
@RequestMapping("/api/class")
public class ClassController {
    @Autowired
    ClassService classService;

    @RequestMapping("/list")
    List listAll() {
        return classService.listAll();
    }
}
