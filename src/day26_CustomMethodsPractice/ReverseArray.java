package day26_CustomMethodsPractice;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int[] result = revers(arr);
        System.out.println(Arrays.toString(result));
    }

    //reverse the given array, returns a new array
    public static int[] revers(int[] array){
        int[] result =new int[array.length];

        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] = array[i];
        }
        return result;

 /*
       for (int i = array.length - 1, j=0; i >= 0; i--, j++) {
            result[j]= array[i];
        }
          return result;

 */


    }

    //reverse the given array, returns a new array
    public static double[] revers(double[] array){
        double[] result =new double[array.length];

        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] = array[i];
        }
        return result;
    }

    //reverse the given array, returns a new array
    public static char[] revers(char[] array){
        char[] result =new char[array.length];

        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] = array[i];
        }
        return result;
    }

    //reverse the given array, returns a new array
    public static String[] revers(String[] array){
        String[] result =new String[array.length];

        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] = array[i];
        }
        return result;
    }



}
