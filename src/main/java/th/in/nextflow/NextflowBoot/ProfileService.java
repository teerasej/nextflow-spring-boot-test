package th.in.nextflow.NextflowBoot;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProfileService {

    private final RestTemplate restTemplate;

    public ProfileService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getProfiles() {
        String url = "https://651d740c44e393af2d59d2b4.mockapi.io/api/profiles";
        return restTemplate.getForObject(url, String.class);
    }
}