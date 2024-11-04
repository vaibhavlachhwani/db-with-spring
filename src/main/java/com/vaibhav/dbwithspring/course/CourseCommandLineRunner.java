package com.vaibhav.dbwithspring.course;

import com.vaibhav.dbwithspring.course.jpa.CourseJpaRepository;
import com.vaibhav.dbwithspring.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(12, "Dummy", "Jackson Pollock"));
        repository.save(new Course(13, "Placeholder", "John Deo Doe"));
        repository.save(new Course(1, "Java Fundamentals", "John Doe"));
        repository.save(new Course(2, "Spring Boot Essentials", "Jane Smith"));
        repository.save(new Course(3, "Data Structures in Java", "Robert Brown"));
        repository.save(new Course(4, "Advanced Java Programming", "Emily White"));
        repository.save(new Course(5, "Microservices with Spring Boot", "Michael Johnson"));
        repository.save(new Course(6, "Database Design", "Laura Davis"));
        repository.save(new Course(7, "Java for Beginners", "Daniel Thompson"));
        repository.save(new Course(8, "REST APIs with Spring Boot", "Patricia Green"));
        repository.save(new Course(9, "Multithreading in Java", "Linda Lewis"));
        repository.save(new Course(10, "Java Memory Management", "David King"));

        repository.deleteById(4L);

        var c = repository.findById(5L);
        System.out.println(c);

        System.out.println(repository.findAll());

        repository.findByAuthor("John Doe").stream()
                .forEach(System.out::println);
    }
}
