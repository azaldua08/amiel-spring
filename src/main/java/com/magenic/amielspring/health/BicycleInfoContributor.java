package com.magenic.amielspring.health;

import org.springframework.boot.actuate.info.Info.Builder;
import org.springframework.stereotype.Component;

import java.util.Collections;

import com.magenic.amielspring.services.BicycleService;

import org.springframework.boot.actuate.info.InfoContributor;

@Component
public class BicycleInfoContributor implements InfoContributor {

    BicycleService service;

    public BicycleInfoContributor(BicycleService bicycleService) {
        this.service = bicycleService;
    }

    @Override
    public void contribute(Builder builder) {
        long bicycleCount = this.service.getBicycleCount();

        builder.withDetail("bicycleInfo", Collections.singletonMap("count", bicycleCount));
    }
}