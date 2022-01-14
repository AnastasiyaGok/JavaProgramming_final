package day06_PtimitiveTypeCastings;

public class ArithmeticOperators {
    public static void main(String[] args) {

        System.out.println("12" + 1); //121 concatenation
        System.out.println(10 + 20); //30 Addition
        System.out.println(100 - 50);
        System.out.println(10 * 5); //50

        System.out.println(10 / 4); //2.5
        System.out.println(10.0 / 4);
        System.out.println(10 /4.0);
        System.out.println(10d / 4);

        int a = 100;
        double b = a/6;
        System.out.println(b);

        double c = (double)a/6;
        System.out.println(c);



    }
}
/*
  +: Addition
  -: Subtract
  *: Multiplication
  /: Division
  %: Remainder

  integer / integer ======> integer
  decimal /integer =======> decimal
  integer / decimal ========> decimal
  decimal /decimal ========> decimal
 */