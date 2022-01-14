package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveElement2 {

    public static void main(String[] args) {

        int[] numbers = {100, 200, 300, 400, 500};
        numbers = removeElement(numbers, 1);
      //  numbers = removeElement(numbers,1);
        System.err.println(Arrays.toString(numbers));



    }

    public static int[] removeElement(int[] array, int index){

        if (index<0 || index> array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }
        int[] result = {};

        for (int i = 0; i < array.length; i++) {// i: array's index number
            if (i != index){
                result = ArraysUtility.addElement(result, array[i]);
            }
        }
        return result;
                
    }
}
