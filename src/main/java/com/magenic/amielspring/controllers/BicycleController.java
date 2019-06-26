package com.magenic.amielspring.controllers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.validation.Valid;

import com.magenic.amielspring.domain.Bicycle;
import com.magenic.amielspring.services.BicycleService;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.micrometer.core.annotation.Timed;

@Timed
@RestController
public class BicycleController {

	private final BicycleService service;

	public BicycleController(BicycleService service) {
		this.service = service;
	}

	@Timed(value = "all.bicycles")
	@GetMapping(value = "/bicycles")
	public Iterable<Bicycle> getAll() {
		return service.findAll();
	}

	@Timed(value = "get.bicycle")
	@GetMapping(value = "/bicycles/{serialNumber}")
	public Bicycle getBySerialNumber(@PathVariable String serialNumber) {

		return service.findBySerialNumber(serialNumber);
	}

	@Timed(value = "new.bicycle")
	@PostMapping(value = "/bicycles", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Bicycle save(@RequestBody @Valid Bicycle entity) {
		Bicycle bike = service.save(entity);
		return bike;
	}

	@Timed(value = "update.bicycle")
	@PutMapping(value = "/bicycles")
	public Bicycle update(@RequestBody Bicycle entity) {
		Bicycle bike = service.update(entity);
		return bike;
	}

	@Timed(value = "delete.bicycle")
	@DeleteMapping(value = "/bicycles/{serialNumber}")
	public String delete(@PathVariable String serialNumber) {
		Bicycle bike = service.findBySerialNumber(serialNumber);
		service.delete(bike);
		return "Bike deleted";
	}

}