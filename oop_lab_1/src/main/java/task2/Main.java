package task2;

import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Error: No file paths provided");
            return;
        }

        FileReaderLab1 FileReader1 = new FileReaderLab1();

        for(String inst : args) {
            String filePath = inst;
            String fileText = FileReader1.readFileIntoString(filePath);
            TextData textData = new TextData(filePath, fileText);
            textData.showTextDate();
            System.out.println("\n");
        }
    }
}
