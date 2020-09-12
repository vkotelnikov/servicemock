package kotelnikov.servicemock.controller;

import kotelnikov.servicemock.config.JsonConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.ResponseEntity;
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

    @MockBean
    JsonConfig jsonConfig;

    @Test
    void getSampleAsJson() throws Exception {
//        ResponseEntity<String> response = testRestTemplate.getForEntity(URI.create("/dadata/sample"), String.class);
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
