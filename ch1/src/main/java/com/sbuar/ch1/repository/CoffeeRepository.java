package com.sbuar.ch1.repository;

import com.sbuar.ch1.models.Coffee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
interface CoffeeRepository extends CrudRepository<Coffee, Long> {
}
