package com.vaibhav.dbwithspring.course;

import com.vaibhav.dbwithspring.course.jpa.CourseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJpaCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(12, "Dummy", "Jackson Pollock"));
        repository.insert(new Course(13, "Placeholder", "John Deo Doe"));
        repository.insert(new Course(1, "Java Fundamentals", "John Doe"));
        repository.insert(new Course(2, "Spring Boot Essentials", "Jane Smith"));
        repository.insert(new Course(3, "Data Structures in Java", "Robert Brown"));
        repository.insert(new Course(4, "Advanced Java Programming", "Emily White"));
        repository.insert(new Course(5, "Microservices with Spring Boot", "Michael Johnson"));
        repository.insert(new Course(6, "Database Design", "Laura Davis"));
        repository.insert(new Course(7, "Java for Beginners", "Daniel Thompson"));
        repository.insert(new Course(8, "REST APIs with Spring Boot", "Patricia Green"));
        repository.insert(new Course(9, "Multithreading in Java", "Linda Lewis"));
        repository.insert(new Course(10, "Java Memory Management", "David King"));

        repository.deleteById(4);

        var c = repository.findById(5);
        System.out.println(c);
    }
}
