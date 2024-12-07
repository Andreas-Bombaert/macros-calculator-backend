package com.macros.calculator.backend.business.impl;

import com.macros.calculator.backend.business.UserDataCollectionBusinessManager;
import com.macros.calculator.backend.dto.UserAddressDto;
import com.macros.calculator.backend.dto.UserDataCollectionDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@Component
@RequiredArgsConstructor
public class UserDataCollectionBusinessManagerImpl implements UserDataCollectionBusinessManager {
    private static final HashMap<Long, UserDataCollectionDto> mockUsers = new HashMap<>();
    @Override
    public List<UserDataCollectionDto> getUsers(){
        fillMockUsers();
        return mockUsers.values().stream().toList();
    }

    @Override
    public UserDataCollectionDto getUserById(Long id) {
        fillMockUsers();
        log.info(String.valueOf(id));
        return mockUsers.get(id);
    }

    public void fillMockUsers(){
        mockUsers.put(2L,(new UserDataCollectionDto(2L, "Léa Dubois", 31, 65.2, 168, "lea.dubois@gmail.com", new UserAddressDto("Rue des Lilas", "Paris", "75015"), new Date(), new Date(), new Date(), false)));
        mockUsers.put(3L,(new UserDataCollectionDto(3L, "Thomas Martin", 28, 80.7, 185, "thomas.martin@outlook.fr", new UserAddressDto("Avenue de la Liberté", "Marseille", "13001"), new Date(), new Date(), new Date(), true)));
        mockUsers.put(4L,(new UserDataCollectionDto(4L, "Sophie Dupont", 45, 58.9, 170, "sophie.dupont@wanadoo.fr", new UserAddressDto("Chemin du Lac", "Bordeaux", "33000"), new Date(), new Date(), new Date(), false)));
        mockUsers.put(5L,(new UserDataCollectionDto(5L, "Benjamin Lefebvre", 22, 73.1, 178, "benjamin.lefebvre@free.fr", new UserAddressDto("Place de la République", "Lyon", "69001"), new Date(), new Date(), new Date(), true)));
        mockUsers.put(6L,(new UserDataCollectionDto(6L, "Charlotte Perrin", 38, 62.5, 165, "charlotte.perrin@orange.fr", new UserAddressDto("Route de la Mer", "Nice", "06000"), new Date(), new Date(), new Date(), false)));
        mockUsers.put(7L,(new UserDataCollectionDto(7L, "Victor Moreau", 29, 82.3, 190, "victor.moreau@sfr.fr", new UserAddressDto("Allée des Champs", "Toulouse", "31000"), new Date(), new Date(), new Date(), true)));
        mockUsers.put(8L,(new UserDataCollectionDto(8L, "Émilie Bernard", 35, 68.1, 172, "emilie.bernard@laposte.net", new UserAddressDto("Impasse du Moulin", "Nantes", "44000"), new Date(), new Date(), new Date(), false)));
        mockUsers.put(9L,(new UserDataCollectionDto(9L, "Mathieu Durand", 27, 79.5, 183, "mathieu.durand@gmail.com", new UserAddressDto("Boulevard Voltaire", "Strasbourg", "67000"), new Date(), new Date(), new Date(), true)));
        mockUsers.put(10L,(new UserDataCollectionDto(10L, "Aurélie Fournier", 32, 66.8, 167, "aurelie.fournier@yahoo.fr", new UserAddressDto("Rue de la Paix", "Lille", "59000"), new Date(), new Date(), new Date(), false)));
    }
}
