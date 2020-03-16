package RestApi.movies.service;

import RestApi.movies.JsonReader;
import RestApi.movies.model.Movies;
import RestApi.movies.model.Movie;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class MovieService {

    @Autowired
    private JsonReader jsonReader;

    ObjectMapper objectMapper = new ObjectMapper();

    public Movies findAll() throws IOException {

        byte[] jsonData = jsonReader.getData();

        Movies movies = objectMapper.readValue(jsonData, Movies.class);

        return movies;

    }

    public Movie findMovie(int id) throws IOException {

        byte[] jsonData = jsonReader.getData();

        Movies movies = objectMapper.readValue(jsonData, Movies.class);

        for (Movie movie : movies.getMovies()) {
            if (movie.getMovieId() == id) {

                return movie;
            }
        }

        return null;

    }

    public void create() throws IOException {

    }

    public void delete() throws IOException {

    }


}
