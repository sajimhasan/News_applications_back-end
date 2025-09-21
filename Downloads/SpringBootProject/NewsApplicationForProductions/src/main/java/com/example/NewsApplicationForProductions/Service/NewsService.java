package com.example.NewsApplicationForProductions.Service;


import com.example.NewsApplicationForProductions.Model.News;
import com.example.NewsApplicationForProductions.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class NewsService {


    @Autowired
    private NewsRepository newsRepository;


    // post news
    public News add(News news){
        news.setLocalDateTime(LocalDateTime.now());
        return newsRepository.save(news);
    }

    //read news
    public List<News> getAllNews(News news){

        return newsRepository.findAll();
    }

    // get one  news
    public Optional<News> SearchNews( String id){
   return  newsRepository.findById(id);
    }

    // update news
    public News updatenewses(String id , News advanceNews){
        Optional<News> existingNews = newsRepository.findById(id);
        if (existingNews.isPresent()){
            News news = existingNews.get();
            news.setCategory(advanceNews.getCategory());
            news.setImage(advanceNews.getImage());
            news.setDetails(advanceNews.getDetails());
            news.setCreatorname(advanceNews.getCreatorname());
            news.setTitle(advanceNews.getTitle());
            news.setLocalDateTime(LocalDateTime.now());
            return newsRepository.save(news);
        }else {
            throw new RuntimeException("News is not define");
        }
    }

    // delete method
    public String deletenewsByid(String id){
        newsRepository.deleteById(id);
        return "Deleted!!";
    }
}
