package task2;

public class TextData {
    private String fileName;
    private String text;
    private int numberOfVowels;
    private int numberOfConsonants;
    private int numberOfLetters;
    private int numberOfSentences;
    private String longestWord;

    public TextData(String filePath, String text){
        this.fileName = extractName(filePath);
        this.text = text;
        this.numberOfVowels = countVowels();
        this.numberOfConsonants = countConsonants();
        this.numberOfLetters = countLetters();
        this.numberOfSentences = countSentences();
        this.longestWord = findLongestWord();

    }

    static String extractName(String filePath) {
        int lastSlashIndex = filePath.lastIndexOf("\\");
        return filePath.substring(lastSlashIndex + 1);
    }

    public String getFileName() {
        return fileName;
    }

    public String getText() {
        return text;
    }

    public int getNumberOfVowels() {
        return numberOfVowels;
    }

    private int countVowels() {
        int count = 0;
        String vowels = "AEIOUaeiou";

        for (int i = 0; i < this.text.length(); i++) {
            char ch = this.text.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }

//    //using lambda function
//        private int countVowels(String text) {
//        return (int) text.chars() //return unicode values for each chr
//                .filter(ch -> "AEIOUaeiou".indexOf(ch) != -1) //filter() applies a condition to each element of the stream,
//                //if its false it does not count
//                //the indexes of ch in "AEIOUaeiou" are from 0
//                //so "AEIOUaeiou".indexOf(ch) != -1) is true for vowels
//                //altogether the predicate is a lambda expression - allows to create a concise function inline
//                //ch being the input
//                .count();
//    }

    public int getNumberOfConsonants() {
        return numberOfConsonants;
    }

    private int countConsonants() {
        int count = 0;
        String vowels = "AEIOUaeiou";

        for (int i = 0; i < this.text.length(); i++) {
            char ch = this.text.charAt(i);
            if (Character.isLetter(ch) && vowels.indexOf(ch) == -1) {
                count++;
            }
        }
        return count;
    }

    public int getNumberOfLetters() {
        return numberOfLetters;
    }

    private int countLetters() {
        return this.numberOfVowels + this.numberOfConsonants;
    }

    public int getNumberOfSentences() {
        return numberOfSentences;
    }

//    //has problems with things like D.C., etc., and Roe v. Wade AND count empty sentences (whitespaces)
//    private int countSentences() {
//        return this.text.split("[.!?]").length;
//        //finds each occurrence in the text of . ! ?
//        //using [.!?] means match any of the chr inside
//        //split() returns an array of substrings defined by the regex [.!?]
//        //and then we count it
//    }

    private int countSentences() {
        String[] sentences = this.text.split("[.!?]");
        int count = 0;

        for (int i = 0; i < sentences.length; i++) {
            String sentence = sentences[i].trim(); //Get rid of whitespace
            if (!sentence.isEmpty()) {
                count++;
            }
        }

        return count;
    }


    public String getLongestWord() {
        return longestWord;
    }

    public String findLongestWord() {
        String[] words = this.text.split("\\W+"); // Split by non-word characters
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }

    public void showTextDate(){
        System.out.println("File Name: " + this.getFileName());
        System.out.println("Text Content:\n" + this.getText());
        System.out.println("Number of Vowels: " + this.getNumberOfVowels());
        System.out.println("Number of Consonants: " + this.getNumberOfConsonants());
        System.out.println("Number of Letters: " + this.getNumberOfLetters());
        System.out.println("Number of Sentences: " + this.getNumberOfSentences());
        System.out.println("Longest Word: " + this.getLongestWord());
        System.out.println("\n");
    }
}
