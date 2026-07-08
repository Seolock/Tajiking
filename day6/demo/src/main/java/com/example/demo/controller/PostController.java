package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.PostRequest;
import com.example.demo.dto.PostResponse;
import com.example.demo.service.PostService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;
    
    @GetMapping("/userPosts/{id}")
    public List<PostResponse> userPosts(@PathVariable("id") Long id){
        return postService.userPosts(id);
    }

    @PostMapping("/addPost/{id}")
    public void addPost(@PathVariable("id") Long id, @RequestBody PostRequest postRequest){
        postService.addPost(id, postRequest);
    }

}
