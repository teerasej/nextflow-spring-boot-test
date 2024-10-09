package th.in.nextflow.NextflowBoot;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class ProfileControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ProfileService profileService;

    @Test
    public void shouldReturnProfiles() throws Exception {

        when(profileService.getProfiles()).thenReturn("[{\"id\":\"1\",\"name\":\"John Doe\"}]");

        this.mockMvc.perform(get("/profiles"))
                .andExpect(status().isOk())
                .andExpect(content().string("[{\"id\":\"1\",\"name\":\"John Doe\"}]"));
    }
}