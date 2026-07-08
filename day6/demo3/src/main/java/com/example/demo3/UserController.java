package com.example.demo3;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/add")
    public void create(@RequestBody UserRequest userRequest){
        userService.create(userRequest);
    }

    @GetMapping("/readAll")
    public List<UserResponse> readAll(){
        return userService.readAll();
    }

    @GetMapping("/read/{id}")
    public UserResponse read(@PathVariable("id") Long id){
        return userService.read(id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id){
        userService.delete(id);
    }

    @PutMapping("/update/{id}")
    public void update(@PathVariable("id") Long id, 
    @RequestBody UserUpdateRequest userUpdateRequest){
        userService.update(id, userUpdateRequest);
    }


}
