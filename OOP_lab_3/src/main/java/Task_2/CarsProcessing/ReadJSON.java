package Task_2.CarsProcessing;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ReadJSON {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    public Car readJSON(File path) throws IOException {
        Car car = null;

        if (path.exists() && path.isFile()) {
            try {
                car = objectMapper.readValue(path, Car.class);
            } catch (IOException e) {
                e.printStackTrace();
                throw new IOException("Failed to parse the JSON file: " + path.getAbsolutePath(), e);
            }
        } else {
            System.out.println("The file does not exist or is not a valid file: " + path.getAbsolutePath());
        }

        return car;
    }
}

