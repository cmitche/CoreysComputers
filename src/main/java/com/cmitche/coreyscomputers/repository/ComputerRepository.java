package com.cmitche.coreyscomputers.repository;

import com.cmitche.coreyscomputers.vo.Computer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComputerRepository extends CrudRepository<Computer, Long> {
    // FILTER ITEMS BASED ON BRAND
    List<Computer> findByBrand(String brand);

    // FILTER ITEMS BASED ON STAR RATING
    List<Computer> findByRating(Integer rating);
}
