package th.in.nextflow.NextflowBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import th.in.nextflow.NextflowBoot.ProfileService;


@RestController
public class ProfileController {

    @Autowired
    private ProfileService profileService;

    @GetMapping("/profiles")
    public String getProfiles() {
        return profileService.getProfiles();
    }
}
