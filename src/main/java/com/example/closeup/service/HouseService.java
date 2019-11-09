package com.example.closeup.service;

import com.example.closeup.model.House;
import com.example.closeup.repository.HouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HouseService {

    @Autowired
    private HouseRepository houseRepository;

    public House findOne(long id) {
        return houseRepository.findById(id);
    }
}
