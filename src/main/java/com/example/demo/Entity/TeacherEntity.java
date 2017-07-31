package com.example.demo.Entity;

import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Think on 2017/7/25.
 */
@Entity
@Table(name = "teacher", schema = "test", catalog = "")
@JsonIgnoreProperties(value = { "handler", "hibernateLazyInitializer" })
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "teacherId")
public class TeacherEntity {
    private int teacherId;
    private String teacherName;

    private Set<StudentEntity> students;
    @OneToMany(mappedBy = "teacher", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    public Set<StudentEntity> getStudents() { return students; }
    public void setStudents(Set<StudentEntity> students) { this.students = students; }

    @Id
    @GeneratedValue
    @Column(name = "teacher_id")
    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    @Basic
    @Column(name = "teacher_name")
    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TeacherEntity that = (TeacherEntity) o;

        if (teacherId != that.teacherId) return false;
        if (teacherName != null ? !teacherName.equals(that.teacherName) : that.teacherName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = teacherId;
        result = 31 * result + (teacherName != null ? teacherName.hashCode() : 0);
        return result;
    }
}
