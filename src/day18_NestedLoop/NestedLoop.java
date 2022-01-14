package day18_NestedLoop;

public class NestedLoop {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.err.println("Wooden Spoon");
        }
        for (int i = 0; i < 5; i++) {
            System.err.println("Wooden Spoon");
        }
        for (int i = 0; i < 5; i++) {
            System.err.println("Wooden Spoon");

        }
        for (int i = 0; i < 5; i++) {
            System.err.println("Wooden Spoon");

        }
        for (int i = 0; i < 5; i++) {
            System.err.println("Wooden Spoon");

        }

        System.err.println("--------------------------------------------------");

        for (int j = 0; j < 4; j++) { //j: 0, 1, 2, 3

            for (int i = 0; i < 5; i++) { //i: 1, 2, 3, 4
                System.err.println("Wooden Spoon");

            }

        }


    }

}