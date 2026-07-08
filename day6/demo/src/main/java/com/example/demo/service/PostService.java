package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.domain.Post;
import com.example.demo.domain.User;
import com.example.demo.dto.PostRequest;
import com.example.demo.dto.PostResponse;
import com.example.demo.repository.PostRepository;
import com.example.demo.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PostService {
    
    private final PostRepository postRepository;
    private final UserRepository userRepository;

    public void addPost(Long id, PostRequest postRequest){
        User user = userRepository.findById(id).orElse(null);
        Post post = Post.from(user, postRequest);
        postRepository.save(post);
    }


    public List<PostResponse> userPosts(Long id){
        User user = userRepository.findById(id).orElse(null);
        List<Post> posts = postRepository.findAllByUser(user);
        return posts.stream().map(PostResponse::from).toList();
    }

}
