package com.example.demo.util;

import com.example.demo.model.Employee;
import com.example.demo.model.Order;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.repository.OrderRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * by Aksenchenko Serhii on 06.04.2022
 */

@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository employeeRepository,
                                   OrderRepository orderRepository) {

        return args -> {
            employeeRepository.save(new Employee("Sergy", "Aksenchenko", "senior developer"));
            employeeRepository.save(new Employee("Artem", "Polonenko", "middle developer"));
            employeeRepository.findAll().forEach(employee -> log.info("Preloaded : " + employee));

            orderRepository.save(new Order("MacBook PRO", Status.COMPLETED));
            orderRepository.save(new Order("iPhone 13", Status.IN_PROGRESS));
            orderRepository.findAll().forEach(order -> log.info("Preloaded : " + order));
        };
    }
}
