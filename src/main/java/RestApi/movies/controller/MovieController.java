package RestApi.movies.controller;

import RestApi.movies.model.Movies;
import RestApi.movies.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.io.IOException;

@RestController
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping
    @RequestMapping("/movies")
    public Movies[] getAll() throws IOException {

        Movies[] response = movieService.findAll().getMovies();

        return response;

    }

    @GetMapping
    @RequestMapping("/movies/{id}")
    public Movies getMovie(@PathVariable int id) throws IOException {

        Movies response = movieService.findMovie(id);

        return response;

    }

}
