package com.example.NewsApplicationForProductions.Controller;


import com.example.NewsApplicationForProductions.Model.News;
import com.example.NewsApplicationForProductions.Service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class NewsController {


    @Autowired
    private NewsService newsService;

    @GetMapping("/read")
    public List<News> read(News news){

        return newsService.getAllNews(news );
    }

    @PostMapping("/add")
    public News added(@RequestBody News news){

        return newsService.add(news);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> UpdateNewses(@PathVariable String id , @RequestBody News news ){
       News newNews=  newsService.updatenewses(id , news);
       return ResponseEntity.ok("News Updated ");
    }

    @DeleteMapping("/delete/news/{id}")
    public void deleteNewsesByid(@PathVariable String id){
        newsService.deletenewsByid(id);
    }

    @GetMapping("/read/news/{id}")
    public ResponseEntity<News> searchNewses(@PathVariable String id){
        Optional<News> news = newsService.SearchNews(id);
        return news.map(ResponseEntity::ok).orElseGet(()->
                ResponseEntity.notFound().build());
    }
}
