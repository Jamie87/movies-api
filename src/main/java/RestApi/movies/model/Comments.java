package RestApi.movies.model;

public class Comments {

    private String user;
    private String message;
    private String dateCreated;
    private int like;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    @Override
    public String toString(){
        return getUser() + ", "
                + getMessage() + ", "
                + getDateCreated() + ", "
                + getLike();
    }
}
