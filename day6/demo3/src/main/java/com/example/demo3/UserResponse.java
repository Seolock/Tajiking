package com.example.demo3;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserResponse {
    
    private Long id;
    private String name;

    public static UserResponse from(User user){
        return UserResponse.builder()
            .id(user.getId())
            .name(user.getName())
            .build();
    }
}
