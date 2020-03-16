package RestApi.movies;

import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@Component
public class JsonReader {

    private byte[] data;

    public JsonReader() throws IOException {
        this.data = Files.readAllBytes(Paths.get("movies.json"));
    }

    public byte[] getData() {

        return data;

    }

}
