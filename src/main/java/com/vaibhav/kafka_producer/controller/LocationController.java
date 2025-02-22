package com.vaibhav.kafka_producer.controller;

import com.vaibhav.kafka_producer.service.ProducerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Slf4j
public class LocationController {

    @Autowired
    private ProducerService producerService;

    @PostMapping("/location")
    public String updateLocation(@RequestParam String location) {
        log.info("Controller received Updated location to [" + location+" ]");
        return producerService.updateLocation(location);
    }

}
