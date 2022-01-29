package day42_Exceptions;

public class ThrowsKeyword2 {
    public static void main(String[] args) throws ArithmeticException{ //doesn't help, that's why don't use it with unexpected exceptions

        System.out.println("Test Started");
        System.out.println(8/0);

        System.out.println("Test Completed");
    }
}
