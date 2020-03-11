package RestApi.movies.service;

import RestApi.movies.model.Movies;
import RestApi.movies.model.Movie;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@Component
public class MovieService {

    ObjectMapper objectMapper = new ObjectMapper();

    public Movies findAll() throws IOException {

        byte[] jsonData = Files.readAllBytes(Paths.get("movies.json"));

            Movies movies = objectMapper.readValue(jsonData, Movies.class);
            return movies;

    }

    public ResponseEntity<Movie> findMovie(int id)  {

        try {

            byte[] jsonData = Files.readAllBytes(Paths.get("movies.json"));
            Movies movies = objectMapper.readValue(jsonData, Movies.class);

            for (Movie movie : movies.getMovies()) {
                if (movie.getMovieId() == id) {

                    return new ResponseEntity<>(movie, HttpStatus.OK);
                }
            }

            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            
        } catch (IOException io) {

            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public void create() throws IOException {

    }

    public void delete() throws IOException {

    }


}
