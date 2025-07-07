package com.calculator.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.calculator.model.CalculationRequest;

@CrossOrigin(origins = "http://localhost:5500")
@RestController
public class CalculatorController {

    @PostMapping("/calculate")
    public Map<String, Object> calculate(@RequestBody CalculationRequest req) {
        double a = req.getNum1();
        double b = req.getNum2();
        String op = req.getOperation();

        switch (op) {
            case "add" -> {
                return Map.of("result", a + b);
            }
            case "subtract" -> {
                return Map.of("result", a - b);
            }
            case "multiply" -> {
                return Map.of("result", a * b);
            }
            case "divide" -> {
                if (b == 0) return Map.of("error", "Division by zero not allowed");
                return Map.of("result", a / b);
            }
            default -> {
                return Map.of("error", "Invalid operation");
            }
        }
    }
}
