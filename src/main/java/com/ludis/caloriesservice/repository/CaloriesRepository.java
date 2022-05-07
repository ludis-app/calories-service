package com.ludis.caloriesservice.repository;

import com.ludis.caloriesservice.model.Calories;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CaloriesRepository extends MongoRepository<Calories, Integer> {
    @Query("{name:'?0'}")
    Calories findItemByName(String name);

    @Query(value="{user_id:'?0'}", fields="{'user_id' : 1, 'count' : 1}")
    List<Calories> findAll(int user_id);

    public long count();
}
