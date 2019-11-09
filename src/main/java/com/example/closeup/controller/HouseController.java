package com.example.closeup.controller;


import com.example.closeup.model.House;
import com.example.closeup.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/house")
public class HouseController {

    @Autowired
    private HouseService houseService;

    @RequestMapping("find/{id}")
    public House findHouse (@PathVariable long id) {
        return houseService.findOne(id);
    }
}
