package com.cmitche.coreyscomputers.service;


import com.cmitche.coreyscomputers.repository.ComputerRepository;
import com.cmitche.coreyscomputers.vo.Computer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    // FILTER ITEMS BASED ON BRAND

    // FILTER ITEMS BASED ON STAR RATING

}
