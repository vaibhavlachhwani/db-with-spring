create table course(
                       id bigint not null,
                       name varchar(60) not null,
                       author varchar(60) not null,
                       primary key (id)
);

INSERT INTO course VALUES
                       (1, 'Java Fundamentals', 'John Doe'),
                       (2, 'Spring Boot Essentials', 'Jane Smith'),
                       (3, 'Data Structures in Java', 'Robert Brown'),
                       (4, 'Advanced Java Programming', 'Emily White'),
                       (5, 'Microservices with Spring Boot', 'Michael Johnson'),
                       (6, 'Database Design', 'Laura Davis'),
                       (7, 'Java for Beginners', 'Daniel Thompson'),
                       (8, 'REST APIs with Spring Boot', 'Patricia Green'),
                       (9, 'Multithreading in Java', 'Linda Lewis'),
                       (10, 'Java Memory Management', 'David King');