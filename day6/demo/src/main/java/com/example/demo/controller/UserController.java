package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UserRequest;
import com.example.demo.dto.UserResponse;
import com.example.demo.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/create")
    public UserResponse create(@RequestBody UserRequest userRequest){
        return userService.create(userRequest);
    }

    @GetMapping("/read/{id}")
    public UserResponse read(@PathVariable("id") Long id){
        return userService.read(id);
    }

    @GetMapping("/read")
    public List<UserResponse> readAll(){
        return userService.readAll();
    }

    @PutMapping("/update/{id}")
    public UserResponse update(@PathVariable("id") Long id, @RequestBody UserRequest userRequest){
        return userService.update(id,userRequest);
    }

    @DeleteMapping("/delete/{id}")
    public UserResponse delete(@PathVariable("id") Long id){
        return userService.delete(id);
    }
    
}
