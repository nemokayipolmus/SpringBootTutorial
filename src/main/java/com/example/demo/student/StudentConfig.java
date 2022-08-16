package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student Alper = new Student(
                    "Alper",
                    LocalDate.of(1998, Month.MAY, 5),
                    "aednmz@gmail.com");

            Student Ahmet = new Student(
                    "Ahmet",
                    LocalDate.of(1999, Month.APRIL, 15),
                    "nemokayipolmus@gmail.com");

            Student Alex = new Student(
                    "Alex",
                    LocalDate.of(1992, Month.AUGUST, 25),
                    "nemokayipolmus123@gmail.com");

            repository.saveAll(
                    List.of(Alper,Ahmet,Alex)
            );


        };
    }

}
