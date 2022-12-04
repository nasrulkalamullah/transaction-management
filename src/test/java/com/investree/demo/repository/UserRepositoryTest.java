package com.investree.demo.repository;

import com.investree.demo.model.Users;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void saveUsers(){
        Users users = Users.builder()
                .username("mike")
                .password("password")
                .build();

        userRepository.save(users);
    }

//    @Test
//    public void printAllUsers(){
//        List<Users> usersList =
//                userRepository.findAll();
//    }

}