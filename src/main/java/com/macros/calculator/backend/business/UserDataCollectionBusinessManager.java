package com.macros.calculator.backend.business;

import com.macros.calculator.backend.dto.UserDataCollectionDto;

import java.util.List;

public interface UserDataCollectionBusinessManager {
    List<UserDataCollectionDto> getUsers();

    UserDataCollectionDto getUserById(Long id);
}
