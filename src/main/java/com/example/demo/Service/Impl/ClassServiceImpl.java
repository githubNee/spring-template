package com.example.demo.Service.Impl;

import com.example.demo.Entity.ClassEntity;
import com.example.demo.Entity.StudentEntity;
import com.example.demo.Repository.ClassRepository;
import com.example.demo.Service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Think on 2017/7/30.
 */
@Service
public class ClassServiceImpl implements ClassService {
    @Autowired
    ClassRepository classRepository;

    @Override
    public List listAll() {
        List temp = classRepository.listAll();
        return temp;
    }
}
