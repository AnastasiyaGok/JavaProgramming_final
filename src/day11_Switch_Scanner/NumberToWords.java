package day11_Switch_Scanner;

public class NumberToWords {
    public static void main(String[] args) {

        int number = 7;

        String result = (number >= 0 && number <= 9)?
                        (number == 0)? "Zero" : (number == 1)? "One" : (number == 2)? "Two"
                        :(number == 3)? "Three" :(number == 7)? "Seven" : (number == 8)? "Eight" : "Nine"
                : "Invalid Number";

        System.out.println(result);


    }
}
