package kotelnikov.servicemock.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.net.URI;

/*@SpringBootTest
@AutoConfigureMockMvc*/
@WebMvcTest(DadataController.class)
public class MockMvcDadataControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    void getSampleAsJson() throws Exception {
        MvcResult response = mockMvc.perform(MockMvcRequestBuilders.get(URI.create("/dadata/sample"))).andReturn();
        System.out.println(response);
        System.out.println(response.getResponse().getContentAsString());
    }

    @Test
    void getSampleAsString() throws Exception {
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/dadata/sample-string")).andReturn();
        System.out.println(result.getResponse().getContentAsString());

    }
}
