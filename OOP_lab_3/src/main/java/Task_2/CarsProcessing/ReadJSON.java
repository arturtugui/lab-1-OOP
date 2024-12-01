package Task_2.CarsProcessing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;

public class ReadJSON {

    public Car readJSON(File path) throws IOException {
        Car car = null;

        if (path.exists() && path.isFile()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
                StringBuilder jsonBuilder = new StringBuilder();
                String line;

                while ((line = reader.readLine()) != null) {
                    jsonBuilder.append(line);
                }

                String jsonString = jsonBuilder.toString();

                String idStr = jsonString.split("\"id\":")[1].split(",")[0].trim();
                String type = jsonString.split("\"type\":")[1].split(",")[0].replace("\"", "").trim();
                String passengers = jsonString.split("\"passengers\":")[1].split(",")[0].replace("\"", "").trim();
                String isDiningStr = jsonString.split("\"isDining\":")[1].split(",")[0].trim();
                String consumptionStr = jsonString.split("\"consumption\":")[1].split("}")[0].trim();

                int id = Integer.parseInt(idStr);
                boolean isDining = Boolean.parseBoolean(isDiningStr);
                int consumption = Integer.parseInt(consumptionStr);

                car = new Car(id, type, passengers, isDining, consumption);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return car;
    }
}
