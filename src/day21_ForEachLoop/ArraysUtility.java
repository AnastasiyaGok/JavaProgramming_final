package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5};//hashcode
        System.out.println(nums);//you can't do like that
        System.out.println(Arrays.toString(nums));//you need toString method

        System.out.println(nums[0]);//but for one element of the array you don't need toString method
/*
        String  str = "Java"; //example. you can do like that,if it's not array
        System.out.println(str);;
        System.out.println(str.toString());
*/
        System.out.println("----------------------------------------------------------------");

        int[] scores = {95, 100, 55, 65, 85, 78};
        System.out.println(Arrays.toString(scores));
        Arrays.sort(scores); //{55.....100}
        System.out.println(Arrays.toString(scores));

        System.out.println("Min Score: "+scores[0]);
        System.out.println("Max Score: "+scores[scores.length-1]);

        String[] names = {"Gunay", "Anna", "Zuhal", "Ahmet", "Maria", "Sinem"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        String [] words = {"Anna", "ANNA"};
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));

        System.out.println("---------------------------------------------------");

        int[] arr1 = {1,2,3};
        int[] arr2 = {1,3,2};

        boolean r1 = Arrays.equals(arr1,arr2);
        System.out.println(r1);

        Arrays.sort(arr1); //{1,2,3}
        Arrays.sort(arr2); //{1,2,3}

        boolean r2 = Arrays.equals(arr1,arr2);
        System.out.println(r2);

        System.out.println("------------------------------------------------------------");

        char[] ch1 = {'a', 'c', 'b'};//"acb"
        char[] ch2 = {'b', 'a', 'c'};//"bac"

        Arrays.sort(ch1); //{a ,b, c}
        Arrays.sort(ch2);//{a, b, c}

        boolean anagram = Arrays.equals(ch1, ch2);
        System.out.println("anagram = " + anagram);


    }
}
