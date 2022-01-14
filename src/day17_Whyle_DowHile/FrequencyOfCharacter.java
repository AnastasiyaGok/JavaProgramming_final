package day17_Whyle_DowHile;

public class FrequencyOfCharacter {
    public static void main(String[] args) {

        String str ="AAABBBC";
        char ch = 'A';

        int frequency = 0;
        for (int i = 0; i < str.length(); i++) { //indexes of str
            char eachChar = str.charAt(i); //eachChar: each character of str

            if (ch == eachChar){ //if given ch is matching with the eachChar,then ch is appeared in the string
                frequency++;
               // frequency += 1;
            }

        }
        System.out.println(frequency);

    }
}
/*
 Write a program that can return the frequency of a char from a String
Ex:
str = "AAABBBC"
ch = 'A'
Output:
3
 */
