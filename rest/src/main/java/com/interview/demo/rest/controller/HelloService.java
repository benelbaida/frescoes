package com.interview.demo.rest.controller;

import com.interview.demo.entity.SampleEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * The type Hello service.
 */


@RestController
@RequestMapping("/hello")
public class HelloService {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloService.class);

    /**
     * Ping string.
     *
     * @return the string
     */
    @GetMapping("/ping")
    public String ping() {
        LOGGER.debug("ping is supposed to reply pong");
        return "pong";
    }

    /**
     * Hello world string.
     *
     * @return the string
     */
    @GetMapping
    public String helloWorld() {
        LOGGER.debug("the endpoint helloworld is called");
        return "hello";
    }



    /**
     * Hello world string.
     *
     * @return the string
     */
    @GetMapping("sampleJson")
    @Produces(MediaType.APPLICATION_JSON)
    public SampleEntity sampleSample() {
        return new SampleEntity().setId(0L).setSampleName("sample name");
    }
}
