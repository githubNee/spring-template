package com.example.demo.Controller;

import com.example.demo.Entity.StudentEntity;
import com.example.demo.Entity.TeacherEntity;
import com.example.demo.Repository.StudentRepository;
import com.example.demo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.criteria.*;
import java.util.List;

/**
 * Created by Think on 2017/7/25.
 */
@RestController
@RequestMapping("/api/student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @RequestMapping("/list")
    List listAll() {
        return studentService.listAll();
    }

//    @RequestMapping("/multiQuery")
//    List multiQuery() {
//        List<StudentEntity> result = studentRepository.findAll(
//                (Root<StudentEntity> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder cb) -> {
//            Path<Integer> id = root.get("studentId");
//            Path<String> name = root.get("studentName");
//            return cb.and(cb.equal(id, 1), cb.like(name, "倪奕玮"));
//        });
//
//        for (StudentEntity student : result) {
//            System.out.println(student.getStudentId());
//            System.out.println(student.getTeacher().getTeacherName());
//        }
//        return null;
//    }

//    @RequestMapping("/joinQuery")
//    List joinQuery() {
//        return studentRepository.findAll(
//                (Root<StudentEntity> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder cb) -> {
//            Path name = root.get("studentName");
//            Predicate temp = cb.like(name, "%倪奕玮%");
//            Join<StudentEntity, TeacherEntity> join = root.join("teacher", JoinType.INNER);
//            Path<String> name = join.get("teacherName");
//            return cb.like(name, "%度清风%");
//        });
//    }
}

