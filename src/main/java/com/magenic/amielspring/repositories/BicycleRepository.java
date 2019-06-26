package com.magenic.amielspring.repositories;

import org.springframework.data.repository.CrudRepository;

import com.magenic.amielspring.domain.Bicycle;

public interface BicycleRepository extends CrudRepository<Bicycle, Long> {
    Bicycle findBySerialNumber(String serialNumber);
}
