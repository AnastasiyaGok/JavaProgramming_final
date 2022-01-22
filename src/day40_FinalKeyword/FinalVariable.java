package day40_FinalKeyword;

public class FinalVariable {

    final String birthDay;
    final static String name;

    public FinalVariable(String birthDay) {
        this.birthDay = birthDay;
    }

    static {
        name = "Batch 25";
    }

    public static void main(String[] args) {

        final double pi = 3.14;

        //pi = 4.14; final variables can not be reassigned

        final String name;
        name = "Java";
       // name = "Wooden Spoon"; final variables can not be reassigned

        System.out.println(name);

        System.out.println("------------------------------------------------------------------------------");

        FinalVariable obj = new FinalVariable("May/01");
     //   obj.birthDay = "June/01";// final can not be reassigned

        System.out.println(obj.birthDay);

        System.out.println("--------------------------------------------------------------------------");

       // FinalVariable.name = "Python"; final can not be reassigned

        System.out.println(FinalVariable.name);

    }
}
