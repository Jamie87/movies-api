package RestApi.movies.controller;


import RestApi.movies.model.Movie;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@RestController
public class MovieController {

    @GetMapping
    @RequestMapping("/movies")
    public String getAll() throws IOException {

        byte[] jsonData = Files.readAllBytes(Paths.get("movies.json"));

        ObjectMapper objectMapper = new ObjectMapper();

        Movie movie = objectMapper.readValue(jsonData, Movie.class);

        return movie.getMovies().toString();

    }

    @GetMapping
    @RequestMapping("/movies/{id}")
    public void getMovie() {

    }

}
