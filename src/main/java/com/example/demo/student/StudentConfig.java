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
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {

            Student felipe = new Student(
                    "Felipe",
                    "felipetoledo@gmail.com",
                    LocalDate.of(2004, Month.JANUARY,7)
            );

            Student roberto = new Student(
                    "Roberto",
                    "robertodinamite@gmail.com",
                    LocalDate.of(1976, Month.DECEMBER,26)
            );

            repository.saveAll(
                    List.of(felipe, roberto)
            );
        };
    }
}
