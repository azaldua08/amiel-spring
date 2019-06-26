package com.magenic.amielspring;

import com.magenic.amielspring.domain.Bicycle;
import com.magenic.amielspring.repositories.BicycleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
class BicycleDbInitialize {

    /**
     * Initializes the database with a few objects.
     * 
     * @param repository
     * @return
     */
    @Bean
    CommandLineRunner initDatabase(BicycleRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(new Bicycle(new Long(1), "trinx", "abc", "gg", "", "", "", 12)));
            log.info("Preloading " + repository.save(new Bicycle(new Long(2), "cervelo", "deg", "gg", "", "", "", 12)));
        };
    }
}