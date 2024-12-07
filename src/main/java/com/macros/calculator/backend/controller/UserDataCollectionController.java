package com.macros.calculator.backend.controller;

import com.macros.calculator.backend.business.UserDataCollectionBusinessManager;
import com.macros.calculator.backend.dto.UserDataCollectionDto;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Validated
public class UserDataCollectionController {
    private final UserDataCollectionBusinessManager businessManager;

    @GetMapping(value = "/users")
    public List<UserDataCollectionDto> getUsers(){
        return businessManager.getUsers();
    }


    @GetMapping(value = "/user/{id}")
    public UserDataCollectionDto getUserById(@PathVariable Long id) {
        return businessManager.getUserById(id);
    }
}
