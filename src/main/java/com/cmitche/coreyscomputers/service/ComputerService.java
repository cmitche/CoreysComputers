package com.cmitche.coreyscomputers.service;


import com.cmitche.coreyscomputers.repository.ComputerRepository;
import com.cmitche.coreyscomputers.vo.Computer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ComputerService {
    @Autowired
    private ComputerRepository computerRepository;

    // GET ALL COMPUTERS
    public List<Computer> findAllComputers(){
        return (List<Computer>)computerRepository.findAll();
     }

    // FILTER ITEMS BASED ON SKU NUMBER

    // FILTER ITEMS BASED ON PRODUCT TYPE

    // FILTER ITEMS BASED ON PRICE
    public ResponseEntity<List<Computer>> filterItemsBasedOnPriceRange(double minPrice, double maxPrice){
        // FIND ALL COMPUTERS IN REPO
        Iterable<Computer> allComputersInRepo = computerRepository.findAll();
        List<Computer> listOfAllComputers = new ArrayList<>();
        for (Computer computer : allComputersInRepo){
            listOfAllComputers.add(computer);
        }

        List<Computer> computersInThePriceRange = new ArrayList<>();
        // CHECK IF I HAVE COMPUTERS IN THE LIST
        if (!listOfAllComputers.isEmpty()){
            for (Computer computer : listOfAllComputers){
                Double computerPrice = computer.getPrice();
                if (computerPrice != null
                        && computerPrice >= minPrice
                            && computerPrice <= maxPrice){
                    computersInThePriceRange.add(computer);
                }
            }
        }
        return new ResponseEntity<>(computersInThePriceRange, HttpStatus.CREATED);
    }

    // FILTER ITEMS BASED ON BRAND
    public ResponseEntity<List<Computer>> filterItemsBasedOnBrand(String brand){
        // TODO: MAKE SURE THAT THE BRAND IS IN THE LIST OF AVAILABLE BRANDS
        // FIND ALL COMPUTERS BY BRAND
        List<Computer> listOfComputersByBrand = new ArrayList<>();
        if (brand != null){
            listOfComputersByBrand = computerRepository.findByBrand(brand);
        }
        return new ResponseEntity<>(listOfComputersByBrand, HttpStatus.CREATED);
    }

    // FILTER ITEMS BASED ON STAR RATING
    public ResponseEntity<List<Computer>> filterItemsBasedOnStarRating(Integer numberOfStars){
        List<Computer> listOfComputersByRating = new ArrayList<>();
        if (numberOfStars != null){
            listOfComputersByRating = computerRepository.findByRating(numberOfStars);
        }
        return new ResponseEntity<>(listOfComputersByRating, HttpStatus.CREATED);
    }
}
