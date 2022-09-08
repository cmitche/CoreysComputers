package com.cmitche.coreyscomputers.controller;


import com.cmitche.coreyscomputers.service.ComputerService;
import com.cmitche.coreyscomputers.vo.Computer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<List<Computer>> filterItemsBasedOnPriceRange(double minPrice, double maxPrice){
          return computerService.filterItemsBasedOnPriceRange(minPrice, maxPrice);
    }

    // FILTER ITEMS BASED ON BRAND
    public ResponseEntity<List<Computer>> filterItemsBasedOnBrand(String brand){
        return computerService.filterItemsBasedOnBrand(brand);
    }

    // FILTER ITEMS BASED ON STAR RATING
    public ResponseEntity<List<Computer>> filterItemsBasedOnStarRating(Integer numberOfStars){
        return computerService.filterItemsBasedOnStarRating(numberOfStars);
    }
}
