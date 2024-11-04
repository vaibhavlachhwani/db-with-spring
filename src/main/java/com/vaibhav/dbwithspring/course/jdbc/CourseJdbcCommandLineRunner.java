package com.vaibhav.dbwithspring.course.jdbc;

import com.vaibhav.dbwithspring.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(145, "xDFDSFyx", "dihw  SAEASFDQi"));
        repository.insert(new Course(14215, "xyFDGFx", "dihSFGRSAFwi"));
        repository.insert(new Course(14556, "xSDFDyx", "dihwiWAAWEF"));
        repository.insert(new Course(16545, "xyFDx", "dihqRREwi"));
        repository.insert(new Course(134, "xdsdyx", "dihrafferwi"));

        repository.delete(145);

        var c = repository.findById(14556);
        System.out.println(c);
    }
}
