package se.yrgo.tests;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.beans.factory.annotation.Value;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class PersonTest {

    @Value(value="${local.server.port}")
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    /*
    * Tests the connection towards database.
    * Database will return 'personList' followed by persons in database.
    * */
    @Test
    public void connectionToDatabaseTest() throws Exception {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/persons",
                String.class)).contains("personList");
    }
}
