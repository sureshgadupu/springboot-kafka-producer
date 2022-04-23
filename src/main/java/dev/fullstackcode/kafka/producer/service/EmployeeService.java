package dev.fullstackcode.kafka.producer.service;


import dev.fullstackcode.kafka.producer.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
public class EmployeeService {

    @Autowired
    private KafkaTemplate<Integer, Employee> kafkaTemplate;

    public void publishEmployee(Employee employee) {
        kafkaTemplate.send("create-employee-events",employee);

    }


}

