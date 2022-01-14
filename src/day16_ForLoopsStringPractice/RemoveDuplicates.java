package day16_ForLoopsStringPractice;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "aabbaacc";

        String result = ""; //abc
                           // i <= str.length()-1 (i <= 7 ====> i < 8)
        for (int i = 0; i < str.length() ; i++) { //represents all index numbers of str (starts from 0)
            String ch = ""+str.charAt(i); //represents each character of str

            if (!result.contains(ch)){ //if the character is not contained in the result
                result += ch; //the character will be added to the result

            }

        }
        System.out.println(result);

    }
}
/*
Write a program that can remove the duplicated characters from a String
Ex:
input:
AABBCCBC
Output:
ABC
 */