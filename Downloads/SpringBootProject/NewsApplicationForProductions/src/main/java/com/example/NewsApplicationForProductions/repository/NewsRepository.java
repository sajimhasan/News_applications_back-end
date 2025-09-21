package com.example.NewsApplicationForProductions.repository;

import com.example.NewsApplicationForProductions.Model.News;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface NewsRepository extends MongoRepository<News , String> {
}
