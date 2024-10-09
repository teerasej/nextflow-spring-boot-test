package th.in.nextflow.NextflowBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProfileController {

    @GetMapping("/profiles")
    public String getProfiles() {
        return "[{\"id\":\"1\",\"name\":\"John Doe\"}]";
    }
}
