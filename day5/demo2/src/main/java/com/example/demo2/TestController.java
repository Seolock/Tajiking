package com.example.demo2;

import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequiredArgsConstructor
public class TestController {
    
    private final TestService testService;

    @PutMapping("/test5")
    public String test5(@RequestBody Movie movie) {
        String output = testService.changeMovie(movie);
        return output;
    }

    @PostMapping("/test6/{id}")
    public String test6(@PathVariable("id")int id) {
        String output = testService.getList(id);
        return output;
    }

}
