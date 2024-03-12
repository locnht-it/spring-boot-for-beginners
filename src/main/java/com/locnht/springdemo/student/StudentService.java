package com.locnht.springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> findAllStudents() {
        return List.of(
                new Student(
                        "Loc",
                        "Ngo Huynh Tan",
                        LocalDate.now(),
                        "locnht1@gmail.com",
                        21
                ),
                new Student(
                        "Nam",
                        "Lee Phan Hoai",
                        LocalDate.now(),
                        "namlee@gmail.com",
                        39
                )
        );
    }

}
