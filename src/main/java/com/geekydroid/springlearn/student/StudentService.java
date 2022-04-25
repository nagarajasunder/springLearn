package com.geekydroid.springlearn.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents() {
        return List.of(
                new Student(1L,
                        "Nagaraja",
                        LocalDate.of(2000, Month.JANUARY, 12),
                        "nagarajaswork@gmail.com",
                        21)
        );
    }
}
