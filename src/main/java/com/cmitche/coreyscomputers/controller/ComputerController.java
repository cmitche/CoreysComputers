package com.cmitche.coreyscomputers.controller;


import com.cmitche.coreyscomputers.service.ComputerService;
import com.cmitche.coreyscomputers.vo.Computer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class ComputerController {
      @Autowired
       private ComputerService computerService;

      //GET ALL COMPUTERS
      public List<Computer> findAllComputers(){
          return computerService.findAllComputers();
      }

    // FILTER ITEMS BASED ON SKU NUMBER

    // FILTER ITEMS BASED ON PRODUCT TYPE

    // FILTER ITEMS BASED ON PRICE

    // FILTER ITEMS BASED ON BRAND

    // FILTER ITEMS BASED ON STAR RATING

}
