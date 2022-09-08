package com.cmitche.coreyscomputers.controller;


import com.cmitche.coreyscomputers.service.ComputerService;
import com.cmitche.coreyscomputers.vo.Computer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class ComputerController {
      @Autowired
       private ComputerService computerService;

      //GET ALL COMPUTERS
      public List<Computer> findAllComputers(){
          return computerService.findAllComputers();
      }

    //filter by sku number
    public List<Computer> filterBySkuNumber(Long skuNumber){
          List<Computer> computers = computerService.findAllComputers();
          List<Computer> filteredComputers = new ArrayList<>();
          for (Computer computer : computers) {
              if (computer.getSkuNumber().equals(skuNumber)) {
                  filteredComputers.add(computer);
              }
          }
              return filteredComputers;
          }


    // FILTER ITEMS BASED ON PRODUCT TYPE
    public List<Computer> filterByProductType(String type){
        List<Computer> computers = computerService.findAllComputers();
        List<Computer> filteredComputers = new ArrayList<>();
        for (Computer computer : computers) {
            if (computer.getType().equals(type)) {
                filteredComputers.add(computer);
            }
        }
        return filteredComputers;
    }

    // FILTER ITEMS BASED ON PRICE

    // FILTER ITEMS BASED ON BRAND
    // FILTER ITEMS BASED ON STAR RATING

}
