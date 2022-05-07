package com.ludis.caloriesservice.controller;


import com.ludis.caloriesservice.model.Calories;
import com.ludis.caloriesservice.service.CaloriesService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("calories/")
public class CaloriesController {
    private final CaloriesService caloriesService;

    public CaloriesController(CaloriesService caloriesService) {
        this.caloriesService = caloriesService;
    }

    @GetMapping(value="all")
    public List<Calories> getAccountsByEmpId() {
        List<Calories> caloriesList = caloriesService.findAllCalories();
        return caloriesList;
    }

    @GetMapping(value="create")
    public void createCaloriess() {
        caloriesService.createCaloriesItems();
    }
}
