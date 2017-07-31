package com.example.demo.Repository;

import com.example.demo.Entity.ClassEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

/**
 * Created by Think on 2017/7/30.
 */

public interface ClassRepository extends JpaRepository<ClassEntity, Integer> {
    @Query("select classId as class_id, className as class_name from ClassEntity")
    List<Map> listAll();
}
