package RestApi.movies.controller;

import RestApi.movies.model.Movie;
import RestApi.movies.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
    public ResponseEntity<Movie[]> getAll() throws IOException {

        Movie[] response = movieService.findAll().getMovies();

        return new ResponseEntity<>(response, HttpStatus.OK);

    }

    @GetMapping
    @RequestMapping("/movies/{id}")
    public ResponseEntity<Movie> getMovie(@PathVariable int id) throws IOException {


            Movie response = movieService.findMovie(id);

            if (response != null) {
                return new ResponseEntity<>(response, HttpStatus.OK);
            }

            return new ResponseEntity<>(HttpStatus.NOT_FOUND);


    }

}
