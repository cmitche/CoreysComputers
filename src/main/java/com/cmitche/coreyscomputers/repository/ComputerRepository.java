package com.cmitche.coreyscomputers.repository;

import com.cmitche.coreyscomputers.vo.Computer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComputerRepository extends CrudRepository<Computer, Long> {
}
