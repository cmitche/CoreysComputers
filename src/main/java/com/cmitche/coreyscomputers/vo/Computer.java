package com.cmitche.coreyscomputers.vo;


import lombok.Data;

import javax.persistence.Entity;


@Data
@Entity
public class Computer {


    //skuNumber
    //price
    //model
    //brand
    //type (laptop, desktop, tablet)
    //rating

    private  Long skuNumber;
    private  Double price;
    private  String model;
    private  String brand;
    private  String type;
    private  String rating;







}
