package RestApi.movies.service;

import RestApi.movies.model.Movie;
import RestApi.movies.model.Movies;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

@Component
public class MovieService {

    ObjectMapper objectMapper = new ObjectMapper();

    public Movie findAll() throws IOException {

        byte[] jsonData = Files.readAllBytes(Paths.get("movies.json"));

        try {

            Movie movie = objectMapper.readValue(jsonData, Movie.class);
            return movie;

        } catch (IOException e) {

            e.printStackTrace();
            return null;
        }
    }

    public Movies findMovie(int id) throws IOException {

        byte[] jsonData = Files.readAllBytes(Paths.get("movies.json"));
        Movie movie = objectMapper.readValue(jsonData, Movie.class);

        for (Movies movies : movie.getMovies()) {
            if (movies.getMovieId() == id) {
                return movies;
            }
        }

        return null;

    }

    public void create() throws IOException {

    }

    public void delete() throws IOException {

    }


}
