package kotelnikov.servicemock.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import java.net.URI;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class DadataControllerTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    void getSampleAsJson() {
        ResponseEntity<String> response = testRestTemplate.getForEntity(URI.create("/dadata/sample"), String.class);
        System.out.println(response);
        System.out.println(response.getBody());
    }

    @Test
    void getSampleAsResource() {
        ResponseEntity<String> response = testRestTemplate.getForEntity(URI.create("/dadata/sample-response-body"), String.class);
        System.out.println(response);
        System.out.println(response.getBody());
    }
}