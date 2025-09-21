package com.example.NewsApplicationForProductions.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;
import java.time.LocalDateTime;

@Data
@Document(collection = "News")
@AllArgsConstructor
@NoArgsConstructor
public class News {

    @Id
    private String id;
    private String creatorname;
    private String image;
    private String title;
    private String details;
    private LocalDateTime localDateTime;
    private String category;

    //creator name,
    //image,
    //title,
    //details,
    //local time ,
    //category,

}
