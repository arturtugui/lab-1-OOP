package task2;

import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Invalid argument, provide a path to a .txt file");
            return;
        }
        String filePath = args[0];

        FileReaderLab1 FileReader1 = new FileReaderLab1();
        String fileText = FileReader1.readFileIntoString(filePath);

        TextData textData = new TextData(filePath, fileText);
        System.out.println("File Name: " + textData.getFileName());
        System.out.println("Text Content:\n" + textData.getText());
        System.out.println("Number of Vowels: " + textData.getNumberOfVowels());
        System.out.println("Number of Consonants: " + textData.getNumberOfConsonants());
        System.out.println("Number of Letters: " + textData.getNumberOfLetters());
        System.out.println("Number of Sentences: " + textData.getNumberOfSentences());
        System.out.println("Longest Word: " + textData.getLongestWord());
    }
}
