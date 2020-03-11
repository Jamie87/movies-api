package RestApi.movies.controller;

import RestApi.movies.model.Movie;
import RestApi.movies.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;


@RestController
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping
    @RequestMapping("/movies")
    public Movie[] getAll() throws IOException {

            Movie[] response = movieService.findAll().getMovies();
            return response;

    }

    @GetMapping
    @RequestMapping("/movies/{id}")
    public ResponseEntity getMovie(@PathVariable int id)  {

        ResponseEntity response = movieService.findMovie(id);
        return response;
    }

}
