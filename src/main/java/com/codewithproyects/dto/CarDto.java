package com.codewithproyects.dto;

import lombok.Data;

import java.util.Date;

@Data
public class CarDto {

    private Long id;

    private String brand;

    private String color;

    private String name;

    private String type;

    private String transmission;

    private String description;

    private Long price;

    private Date year;
}
