package com.microservice.user.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.user.dtos.UserRecordDto;
import com.microservice.user.models.UserModel;
import com.microservice.user.services.UserService;

import jakarta.validation.Valid;

@RestController
public class UserController {

    final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    // 1. Save User
    @PostMapping("/users")
    public ResponseEntity<UserModel> saveUser(@RequestBody @Valid UserRecordDto userRecordDto){
        var userModel = new UserModel();
        BeanUtils.copyProperties(userRecordDto, userModel); // Mapeamento DTO <-> Entidade
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(userService.save(userModel));
    }
}
