package com.example.demo.Service.Impl;

import com.example.demo.Entity.TestEntity;
import com.example.demo.Repository.TestRepository;
import com.example.demo.Service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    TestRepository testRepository;

    @Override
    public String test() {
        TestEntity test = testRepository.findById(1);
        return test.getValue();
    }
}
