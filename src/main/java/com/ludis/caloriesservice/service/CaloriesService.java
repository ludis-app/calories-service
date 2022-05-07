package com.ludis.caloriesservice.service;

import com.ludis.caloriesservice.model.Calories;
import com.ludis.caloriesservice.repository.CaloriesRepository;
import com.thoughtworks.xstream.converters.basic.FloatConverter;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CaloriesService {

    final
    CaloriesRepository caloriesRepository;

    public CaloriesService(CaloriesRepository caloriesRepository) {
        this.caloriesRepository = caloriesRepository;
    }

    public void createCaloriesItems() {
        System.out.println("Data creation started...");
        caloriesRepository.save(new Calories(1, 1, (float)243.54, new Date()));
        caloriesRepository.save(new Calories(2, 1, (float)143.75, new Date(System.currentTimeMillis() - 172800000)));
        caloriesRepository.save(new Calories(3, 2, (float)123.54, new Date(System.currentTimeMillis() - 432000000)));
        caloriesRepository.save(new Calories(4, 3, (float)57.43, new Date(System.currentTimeMillis() - 259200000)));
        System.out.println("Data creation complete...");

    }

    public List<Calories> findAllCalories() {
        return caloriesRepository.findAll();
    }
}
