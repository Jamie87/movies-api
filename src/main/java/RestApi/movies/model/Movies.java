package RestApi.movies.model;

public class Movies {

    private int movieId;
    private String title;
    private String description;
    private String producer;
    private boolean availableIn3d;
    private String ageRating;
    private int likes;
    private Comments comments;

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public boolean isAvailableIn3d() {
        return availableIn3d;
    }

    public void setAvailableIn3d(boolean availableIn3d) {
        this.availableIn3d = availableIn3d;
    }

    public String getAgeRating() {
        return ageRating;
    }

    public void setAgeRating(String ageRating) {
        this.ageRating = ageRating;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public Comments getComments() {
        return comments;
    }

    public void setComments(Comments comments) {
        this.comments = comments;
    }

    public String toString(){
        return getMovieId() + ", "
                + getTitle() + ", "
                + getDescription() + ", "
                + getProducer() + ", "
                + isAvailableIn3d() + ", "
                + getAgeRating() + ", "
                + getLikes() + ", "
                + getComments();
    }
}
