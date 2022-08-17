package com.webDeveloment.webAplication.Worker;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class WorkerConfig {

    @Bean
    CommandLineRunner commandLineRunner(WorkerRepository workerRepository){
        return args ->{
           Worker hugo = new Worker(
                    "Hugo",
                    LocalDate.of(2001, Month.OCTOBER, 10),
                    "hugo.nobre012@gmail.com");
           Worker lozeiro = new Worker(
                    "Lozeiro",
                    LocalDate.of(2001, Month.SEPTEMBER, 16),
                    "lozeiros2hugo@gmail.com");
            workerRepository.saveAll(
                    List.of(hugo,lozeiro)
            );

        };
    }
}
