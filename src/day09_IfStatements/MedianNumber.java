package day09_IfStatements;

public class MedianNumber {
    public static void main(String[] args) {

        int a = 10,
                b = 20,
                c = 30;

        //                 a=15, b=10, c=20     a=15, c=10, b=20
        boolean aIsMedian = (a > b && a < c) || (a > c && a < b);

        //                  b=15, a=20, c=10     b=15, a=10, c=20
        boolean bIsMedian = (b > c && b < a) || (b > a && b < c);

        boolean cIsMedian = !aIsMedian && !bIsMedian;

        if (aIsMedian){
            System.out.println(a+" is a median number");

        }
        if (bIsMedian){
            System.out.println(b+" is a median number");

        }
        if (cIsMedian){
            System.out.println(c+" is a median number");
        }


    }
}
