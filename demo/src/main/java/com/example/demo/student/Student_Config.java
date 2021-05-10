package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class Student_Config {

    @Bean
    CommandLineRunner commandLineRunner(Student_Repository repository) {
        return args -> {
            Student_Model ann = new Student_Model(
                    "Ann",
                    "anna@mail.ru",
                    LocalDate.of(1998, Month.JULY, 24)
            );

            Student_Model alex = new Student_Model(

                    "Alex",
                    "anna@mail.ru",
                    LocalDate.of(2003, Month.AUGUST, 21)
            );

            repository.saveAll(
                    List.of(ann, alex)
            );
        };
    }
}
