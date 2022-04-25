package com.geekydroid.springlearn.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student naga = new Student(
                    "naga",
                    LocalDate.of(2000, Month.APRIL, 11),
                    "nagarajaswork@gmail.com",
                    21
            );

            Student raja = new Student(
                    "raja",
                    LocalDate.of(1999, Month.MARCH, 21),
                    "rajaswork@gmail.com",
                    22
            );

            repository.saveAll(List.of(naga, raja));
        };
    }
}
