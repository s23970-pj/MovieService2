package com.example.MovieService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @GetMapping
    public ResponseEntity<List<MovieModel>> getAllMovies() {
        List<MovieModel> movies = new ArrayList<>();

        movies.add(new MovieModel("Rocky", "Action", 1));
        movies.add(new MovieModel("Yellowstone", "Drama", 2));
        movies.add(new MovieModel("Idiocracy", "Comedy", 3));

        return new ResponseEntity<>(movies, HttpStatus.OK);
    }

    MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping(value = "/movies/{id}")
    public ResponseEntity<MovieModel> exception(@PathVariable("id") int id) {
        var q = movieService.getMovie(id);
        if (q != null) {
            return ResponseEntity.ok(q);
        } else
            throw new ExceptionNotFound();

    }
}
