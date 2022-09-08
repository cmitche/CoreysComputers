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

    //get all computers
     public List<Computer> findAllComputers(){
        return (List<Computer>)computerRepository.findAll();
     }


    //get computer by skuNumber
    //filter by brand
    //filter by type
    //filter by rating
    //filter by price
}
