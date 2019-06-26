package com.magenic.amielspring.services;

import com.magenic.amielspring.domain.Bicycle;

public interface BicycleService {
	Iterable<Bicycle> findAll();

	Bicycle findBySerialNumber(String serialNumber);

	Bicycle save(Bicycle bicycle);

	Bicycle update(Bicycle bicycle);

	void delete(Bicycle bike);

	long getBicycleCount();

}
