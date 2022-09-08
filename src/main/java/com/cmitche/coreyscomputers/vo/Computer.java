package com.cmitche.coreyscomputers.vo;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;


@Data
@Entity
public class Computer {
    @Id
    private Long skuNumber;
    private Double price;
    private String model;
    private String brand;
    private String type;
    private Integer rating;
}
