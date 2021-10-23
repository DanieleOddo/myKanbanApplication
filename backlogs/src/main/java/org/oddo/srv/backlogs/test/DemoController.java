package org.oddo.srv.backlogs.test;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
class DemoController{
    @GetMapping("/greeting/{name}")
    public ResponseEntity<String> greeting(@PathVariable String name) {
        return ResponseEntity.ok("Hello "+ name);
    }
}