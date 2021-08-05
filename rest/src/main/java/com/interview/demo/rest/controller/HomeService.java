package com.interview.demo.rest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type Home service.
 */
@RestController
@RequestMapping("/home")
public class HomeService {

    private static final Logger LOGGER = LoggerFactory.getLogger(HomeService.class);

    /**
     * Home string.
     *
     * @return the string
     */
    @GetMapping
    public String home() {
        LOGGER.debug("home endpoint called");
        return "index";
    }

}
