package day13_StringClass;

public class StringMethods {
    public static void main(String[] args) {

        String word = "Cydeo";

        char thirdChar = word.charAt(2);
        System.out.println("thirdChar = " + thirdChar);

        char fifthChar = word.charAt(4);
        System.out.println("fifthChar= " + fifthChar);

        System.out.println("------------------------------------------------");

        String s1 = "Batch 25 is the best batch";

        int totalChars = s1.length();

        System.out.println("totalChars = " + totalChars);

        char lastChars = s1.charAt(s1.length()-1);

        System.out.println("lastChars = " + lastChars);

        System.out.println("--------------------------------------------------");

        String str = "wooden spoon";
        str = str.toUpperCase();
        System.out.println(str);

        String  sentence = "Today is a great day to learn java programming language.";
        sentence = sentence.toUpperCase();

        System.out.println(sentence);


    }
}
