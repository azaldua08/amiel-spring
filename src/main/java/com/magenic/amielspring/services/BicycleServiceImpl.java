package com.magenic.amielspring.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.magenic.amielspring.domain.Bicycle;
import com.magenic.amielspring.repositories.BicycleRepository;

@Service
public class BicycleServiceImpl implements BicycleService {

	private final BicycleRepository repo;

	public BicycleServiceImpl(BicycleRepository repo) {
		this.repo = repo;
	}

	@Override
	public Iterable<Bicycle> findAll() {
		return this.repo.findAll();
	}

	@Override
	public Bicycle findBySerialNumber(String serialNumber) {
		Bicycle bike = this.repo.findBySerialNumber(serialNumber);
		return bike;
	}

	@Override
	public Bicycle save(Bicycle bike) {

		return this.repo.save(bike);
	}

	@Override
	public Bicycle update(Bicycle bicycle) {
		return this.repo.save(bicycle);
	}

	@Override
	public void delete(Bicycle bike) {
		this.repo.delete(bike);
	}

	@Override
	public long getBicycleCount() {
		return this.repo.count();
	}

}
