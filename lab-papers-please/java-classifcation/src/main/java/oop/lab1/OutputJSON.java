package oop.lab1;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;

public class OutputJSON {
    static void outputJSON(Universe uni){
        ObjectMapper mapper = new ObjectMapper();

        try {
            mapper.writeValue(new File("C:/Users/Admin/Desktop/OOP/oop-course-repo/lab-papers-please/output/" + uni.name  +".json"), uni);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    //as universeMap attempt, i did not use it because of issues and because of unknown universe
//    static void outputJSON(Map<String, Universe> universeMap){
//        ObjectMapper mapper = new ObjectMapper();
//
//        for( Universe uni : universeMap.values()){
//            try {
//                mapper.writeValue(new File("C:/Users/Admin/Desktop/OOP/oop-course-repo/lab-papers-please/output/hitchhiker.json"), uni);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//
//    }

}
