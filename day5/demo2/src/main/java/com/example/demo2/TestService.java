package com.example.demo2;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class TestService {

    private final String[] list = {"StarWars","SpiderMan","BeginAgain"};
    
    public String changeMovie(Movie movie){
        Movie newMovie = new Movie(movie.getTitle().toUpperCase(), movie.getYear()+10);
        return newMovie.toString();
    }

    public String getList(int id){
        return list[id];
    }

}
