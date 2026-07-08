package com.example.demo1;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Controller {

    @GetMapping("/test1")
    public String getString(){
        return "Hello World !";
    }

    @GetMapping("/test2/{id}")
    public String testPathVariable(@PathVariable("id") Long id){
        return "ID = "+id.toString();
    }

    @PostMapping("/test3")
    public String testRequestParam(@RequestParam("name") String name){
        return "Name = "+name;
    }

    @PostMapping("/test4")
    public String testRequestBody(@RequestBody Movie movie){
        return movie.toString();
    }

}
