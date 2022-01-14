package day17_Whyle_DowHile;

public class BranchingStatements2 {
    public static void main(String[] args) {

        for (char i = 'A'; i <= 'E'; i++) {
            if (i == 'C') {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("----------------------------------------------------");
        // Print all even numbers 1 ~ 10

        for (int i = 1; i < 11; i++) {
           //if (i%2==0){
           // System.out.println(i);
             if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("-----------------------------------------------------");
        // print all odd numbers 1 ~ 10

        for (int i = 1; i < 11; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);


    }

}


    }

