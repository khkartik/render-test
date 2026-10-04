package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.UserModel;
import com.example.demo.payload.UserPayload;
import com.example.demo.repo.UserRepo;

@Validated 
@RestController 
@RequestMapping ("/user")
public class UserController {
    @Autowired 
    public UserRepo repo;
    @PostMapping ("/add")
    public UserModel addUser(@RequestBody UserPayload payload){
        UserModel userModel=new UserModel();
        userModel.setName(payload.getName());
        userModel.setEmail(payload.getEmail());
        return repo.save(userModel);
    }
    @GetMapping ("/")
    public Optional<UserModel> getUser(@RequestParam Long id){
        return repo.findById(id);
    }
    @GetMapping ("/all-user")
    public List<UserModel>allUser(){
        return repo.findAll();
    }
}
