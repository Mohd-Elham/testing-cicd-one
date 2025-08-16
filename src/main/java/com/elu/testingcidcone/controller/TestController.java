package com.elu.testingcidcone.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public final class TestController {

    /**
     * Test endpoint returning a simple JSON message.
     *
     * @return HTTP 200 with a JSON body containing "message": "test"
     */
    @GetMapping("/test")
    public ResponseEntity<Map<String, Object>> test() {
        Map<String, Object> map = new HashMap<>();
        map.put("message", "test");

        return new ResponseEntity<>(map, HttpStatus.OK);
    }
}
