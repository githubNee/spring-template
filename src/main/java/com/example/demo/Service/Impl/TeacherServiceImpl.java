package com.example.demo.Service.Impl;

import com.example.demo.Repository.TeacherRepository;
import com.example.demo.Service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Think on 2017/7/29.
 */
@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    TeacherRepository teacherRepository;

    @Override
    public List listAll() {
        return teacherRepository.listAll();
    }
}
