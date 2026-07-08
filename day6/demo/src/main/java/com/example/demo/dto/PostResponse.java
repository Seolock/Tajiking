package com.example.demo.dto;

import com.example.demo.domain.Post;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PostResponse {
    
    private String title;
    private String content;

    
    public static PostResponse from(Post post){
        return PostResponse.builder()
            .title(post.getTitle())
            .content(post.getContent())
            .build();
    }

}
