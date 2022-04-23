package dev.fullstackcode.kafka.producer.controller;



import dev.fullstackcode.kafka.producer.dto.Employee;
import dev.fullstackcode.kafka.producer.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;




@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;


    @PostMapping
    public void publishEmployee(@RequestBody Employee employee) {
         employeeService.publishEmployee(employee);
    }

}

