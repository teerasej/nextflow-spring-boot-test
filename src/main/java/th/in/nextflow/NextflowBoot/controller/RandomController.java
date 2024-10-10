package th.in.nextflow.NextflowBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;
import java.util.stream.IntStream;

@RestController
public class RandomController {

    @GetMapping("/random-numbers")
    public int[] getRandomNumbers() {
        Random random = new Random();
        return IntStream.generate(() -> random.nextInt(100)) // Generate random numbers between 0 and 99
                        .limit(5)
                        .toArray();
    }
}