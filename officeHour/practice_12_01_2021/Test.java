package practice_12_01_2021;


import utilities.StringUtility;

public class Test {
    public static void main(String[] args) {
        String str = "Wooden Spoon";
        StringUtility.printEachChar(str);

        System.out.println("----------------------------------");

        String s1 = "Wooden Spoon";
        String reverse = StringUtility.reverse(s1);
        System.out.println(reverse);

        System.out.println("--------------------------------------------");

        String word = "Civic";
        boolean palindrome = StringUtility.isPalindrome(word);
        System.out.println("palindrome = " + palindrome);

        System.out.println("------------------------------------------------");

        String[] names = {"Anna", "Java", "Pyrhon", "Mom", "racecar", "Cydeo"};
        int count = 0;
        for (String each : names) {
            if (StringUtility.isPalindrome(each)){
               count++;
            }
        }
        System.out.println(count);

        System.out.println("----------------------------------------");

        String s2 = "aaaaaaabbbbbcccccdddddd";
        String nonDup = StringUtility.removeDuplicates(s2);
        System.out.println(nonDup);



    }

}
