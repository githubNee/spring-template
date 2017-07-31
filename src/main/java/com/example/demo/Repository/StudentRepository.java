package com.example.demo.Repository;

import com.example.demo.Entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by Think on 2017/7/25.
 */
public interface StudentRepository
        extends JpaRepository<StudentEntity, Integer>, JpaSpecificationExecutor<StudentEntity> {
    @Query("select s from StudentEntity s")
    List<StudentEntity> listAll();
}
