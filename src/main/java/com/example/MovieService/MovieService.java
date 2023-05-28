package com.example.MovieService;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {
    List<MovieModel> movieModels = List.of(new MovieModel("Yellowstone", "Drama", 4));

    public MovieModel getMovie(int id) {

        return movieModels.stream().filter(q -> q.id == id).findAny().orElseGet(() -> null); //mozna zrobic for który szuka po kolei po elementach albo mapa
    }

}
