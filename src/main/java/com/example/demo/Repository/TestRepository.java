package com.example.demo.Repository;

import com.example.demo.Entity.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Think on 2017/7/17.
 */
public interface TestRepository extends JpaRepository<TestEntity, Integer> {
    TestEntity findById(int id);
}
