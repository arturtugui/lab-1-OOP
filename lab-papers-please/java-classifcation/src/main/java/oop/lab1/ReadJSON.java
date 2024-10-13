// to make it work for input, change the pathname and data -> input
package oop.lab1;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadJSON {

    public List<Individual> readJSON() {

        List<Individual> individuals = new ArrayList<>();
        ObjectMapper mapper = new ObjectMapper();

        try{
            File inputFile = new File("C:/Users/Admin/Desktop/OOP/oop-course-repo/lab-papers-please/java-classifcation/src/main/resources/test-input.json");
            JsonNode data = mapper.readTree(inputFile).get("data");

            for (JsonNode node : data) {
                Individual individual = new Individual();

                individual.setId(node.get("id").asInt());

                //here we check first if the field exists (i think i did an overkill here since the constructor already initializes as null)
                individual.setHumanoid(node.has("isHumanoid") ? node.get("isHumanoid").asBoolean() : null);
                individual.setPlanet(node.has("planet") ? node.get("planet").asText() : null);
                individual.setAge(node.has("age") ? node.get("age").asInt() : null);

                if (node.has("traits") && node.get("traits").isArray()) {
                    List<String> traits = new ArrayList<>();
                    for (JsonNode trait : node.get("traits")) { //the array trait can be represented/considered a JsonNode
                        traits.add(trait.asText());
                    }
                    individual.setTraits(traits);
                } else {
                    individual.setTraits(new ArrayList<>()); //empty
                }

                individuals.add(individual);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return individuals;
    }
}
