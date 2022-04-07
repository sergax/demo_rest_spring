package com.example.demo.model;

import com.example.demo.util.Status;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * by Aksenchenko Serhii on 06.04.2022
 */

@NoArgsConstructor
@Data
@Entity
@Table(name = "CUSTOMER_ORDER")
public class Order {
    @Id
    @GeneratedValue
    private Long id;

    private String description;

    private Status status;

    public Order (String description, Status status) {
        this.description = description;
        this.status = status;
    }
}
