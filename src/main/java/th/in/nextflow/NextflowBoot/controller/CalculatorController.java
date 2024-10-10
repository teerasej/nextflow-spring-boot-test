package th.in.nextflow.NextflowBoot.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

// The calculator controller will provide the RESTful API for the calculator
// it contains the following methods:
// - add
// - subtract
// - multiply
// - divide
// client can send a post request with json body to the corresponding endpoint to get the result
@RestController
public class CalculatorController {

    // This url to check that the server is running
    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }

    // a post request method '/add' that takes two numbers in a json object and returns the sum of them
    // the request should be in the form of a json object: { "a": 1, "b": 2 }
    // make the result response in the form of json: 
    // { "result": 3 }
    @PostMapping("/add")
    public Map<String, Integer> add(@RequestBody Map<String, Integer> payload) {
        int a = payload.get("a");
        int b = payload.get("b");
        int result = a + b;
        Map<String, Integer> response = new HashMap<>();
        response.put("result", result);
        return response;
    }

}


