package dev.fullstackcode.kafka.producer.config;

import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.KafkaAdmin;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaTopics {

    @Bean
    public NewTopic topic2() {
        return TopicBuilder.name("create-employee-events")
//                .partitions(10)
//                .replicas(3)
//                .compact()
                .build();
    }

    @Bean
    public NewTopic topic1() {
        return TopicBuilder.name("springboot-topic")
//                .partitions(10)
//                .replicas(3)
//                .compact()
                .build();
    }
}
