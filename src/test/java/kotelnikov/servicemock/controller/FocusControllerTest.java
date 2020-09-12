package kotelnikov.servicemock.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import java.net.URI;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class FocusControllerTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    void getExcerptTest() {
        ResponseEntity<String> response = testRestTemplate.getForEntity(URI.create("/focus/excerpt"), String.class);
        System.out.println(response);
        System.out.println(response.getBody());
    }
}
