package com.ludis.caloriesservice.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document("calories")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Calories {

    @Id
    private int id;

    private int user_id;
    private Float count;
    private Date date;
}
