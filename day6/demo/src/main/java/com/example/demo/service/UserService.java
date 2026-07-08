package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.domain.User;
import com.example.demo.dto.UserRequest;
import com.example.demo.dto.UserResponse;
import com.example.demo.repository.UserRepository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UserResponse create(UserRequest userRequest){
        User user = User.from(userRequest);
        user = userRepository.save(user);
        return UserResponse.from(user);
    }

    public UserResponse read(Long id){
        User user = userRepository.findById(id).orElse(null);
        return UserResponse.from(user);
    }

    public List<UserResponse> readAll(){
        List<User> users = userRepository.findAll();
        return users.stream().map(UserResponse::from).toList();
    }

    @Transactional
    public UserResponse update(Long id, UserRequest userRequest){
        User user = userRepository.findById(id).orElse(null);
        user.setName(userRequest.getName());
        user.setEmail(userRequest.getEmail());
        user.setPassword(userRequest.getPassword());
        return UserResponse.from(user);
    }

    public UserResponse delete(Long id){
        User user = userRepository.findById(id).orElse(null);
        userRepository.deleteById(id);
        return UserResponse.from(user);
    }
    
}
