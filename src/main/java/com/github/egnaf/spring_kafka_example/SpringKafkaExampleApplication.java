package com.github.egnaf.spring_kafka_example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;

@Slf4j
@EnableKafka
@SpringBootApplication
public class SpringKafkaExampleApplication {

    @KafkaListener(topics = "my_topic")
    public void messageListener(String message) {
        System.out.println(message);
        log.info("{}", message);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringKafkaExampleApplication.class, args);
    }

}
