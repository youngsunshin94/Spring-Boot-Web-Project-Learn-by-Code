package org.zerock.ex1.controller;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/hello")
    public String[] hello() {
        return new String[]{"hello", "World"};
    }
}
