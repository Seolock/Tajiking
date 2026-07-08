package com.example.demo3;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    
    private final UserRepository userRepository;

    public void create(UserRequest userRequest){
        User user = User.from(userRequest);
        userRepository.save(user);
    }

    public List<UserResponse> readAll(){
        List<User> users = userRepository.findAll();
        List<UserResponse> userList = users.stream().map(UserResponse::from).toList();
        return userList;
    }

    public UserResponse read(Long id){
        User user = userRepository.findById(id).orElse(null);
        return UserResponse.from(user);
    }

    public void delete(Long id){
        userRepository.deleteById(id);
    }

    @Transactional
    public void update(Long id, UserUpdateRequest userUpdateRequest){
        User user = userRepository.findById(id).orElse(null);
        user.setName(userUpdateRequest.getName());
        user.setEmail(userUpdateRequest.getEmail());
    }

}
