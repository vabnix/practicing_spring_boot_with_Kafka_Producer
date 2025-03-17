package com.vaibhav.kafka_producer.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ProducerService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Async
    public String updateLocation(String location) {
        log.info("Location will be updated to " + location);
        this.kafkaTemplate.send("kafka_topic_1", location);
        return "Location updated to " + location;
    }
}
