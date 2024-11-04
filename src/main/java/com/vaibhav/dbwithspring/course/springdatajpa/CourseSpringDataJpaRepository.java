package com.vaibhav.dbwithspring.course.springdatajpa;

import com.vaibhav.dbwithspring.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {
    public List<Course> findByAuthor(String author);
}
