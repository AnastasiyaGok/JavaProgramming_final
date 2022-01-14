package day21_ForEachLoop;

public class ForEachLoopIntro {
    public static void main(String[] args) {

        int[] numbers = {10,20,30,40,50,60,70};

        for (int i = 0; i < numbers.length; i++) { //i: indexes of the array
            int eachElements = numbers[i];
            System.out.println(eachElements);
        }
        System.out.println("---------------------------------------------------------");

        for (int each:numbers){ //each: elements of the array
             System.out.println(each);
        }



    }
}
