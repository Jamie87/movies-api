package RestApi.movies.model;

import java.util.Arrays;

public class Movies {

    private Movie[] movies;

    public Movie[] getMovies() {
        return movies;
    }

    public void setMovies(Movie[] movies) {
        this.movies = movies;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "movie=" + Arrays.toString(movies) +
                '}';
    }
}
