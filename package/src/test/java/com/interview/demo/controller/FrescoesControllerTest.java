package com.interview.demo.controller;

import com.interview.demo.DemoApplication;
import com.interview.demo.rest.service.FrescoesService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class FrescoesControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;


    @LocalServerPort
    private int port;

    private String getRootUrl() {
        return "http://localhost:" + port;
    }

    @MockBean
    private FrescoesService frescoesService;

    @Test
    public void contextLoads() {
    }

    /**
     * Test Methode findAll
     */
    @Test
    public void frescoes_findAll_test_basic() {
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(getRootUrl() + "/demo/frescoes",
                HttpMethod.GET, entity, String.class);
        Assert.assertNotNull(response.getBody());
    }

    /**
     * Test Methode findAllAndSortByAscOrDesc
     */
    @Test
    public void frescoes_getAllSortedByDateAscDesc_test_basic() {
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(getRootUrl() + "/frescoes/sort?asc=true",
                HttpMethod.GET, entity, String.class);
        Assert.assertNotNull(response.getBody());
    }

    /**
     * Test Methode findById
     */
    @Test
    public void frescoes_getFrescoesById_test_basic() {
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(getRootUrl() + "/frescoes/2",
                HttpMethod.GET, entity, String.class);
       Assert.assertNotNull(response.getBody());
    }


}
