package com.macros.calculator.backend.dto;

import java.util.Date;

public record UserDataCollectionDto(Long id, String name, Integer age, Double weight, Integer height, String email, UserAddressDto address, Date registeredAt, Date updatedAt, Date lastLogin, boolean isActive) {
}
