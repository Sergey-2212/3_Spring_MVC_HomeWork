package ru.gb.lesson3_homework;

import lombok.Data;

import java.io.Serializable;
@Data
public class Product implements Serializable {
    private Long id;
    private String title;
    private Double cost;
    private static Long counter = 1L;

    public Product() {
        this.id = counter++;
    }

    public Product(String title, Double cost) {
        this.id = counter++;
        this.title = title;
        this.cost = cost;
    }
}
