package com.example.demo.Repository;

import com.example.demo.Entity.TeacherEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by Think on 2017/7/29.
 */
public interface TeacherRepository extends JpaRepository<TeacherEntity, Integer> {
    @Query("select t from TeacherEntity t")
    List<TeacherEntity> listAll();
}
