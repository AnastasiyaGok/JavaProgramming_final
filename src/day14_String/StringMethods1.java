package day14_String;

public class StringMethods1 {
    public static void main(String[] args) {

        String str1 = "     batch 25     ";
        str1 =str1.trim();

        System.out.println(str1);

        String str2 = "Cydeo School";

        int n1 = str2.indexOf("h");
        System.out.println("n1 = " + n1);

        int n2 = str2.indexOf("ool");
        System.out.println("n2 = " + n2);

        String str3 = "Java Programming Language";

        int n3 = str3.indexOf("a");
        System.out.println("n3 = " + n3);

        int n4 = str3.indexOf("a ");
        System.out.println("n4 = " + n4);

        int n5 = str3.indexOf("amm");
        System.out.println("n5 = " + n5);

        int n6 = str3.indexOf("an");
        System.out.println("n6 = " + n6);

        int n7 = str3.indexOf("g");
        System.out.println("n7 = " + n7);

        int n8 = str3.indexOf("g ");
        System.out.println("n8 = " + n8);

        int n9 = str3.indexOf("gua");
        System.out.println("n9 = " + n9);

        int n10 = str3.lastIndexOf("g");
        System.out.println("n10 = " + n10);

        System.out.println("------------------------------------------------");

        String s = "Java Nova Cava Wawa orange";

        int firstA = s.indexOf("a");
        int lastA = s.lastIndexOf("a");
        int secondA = s.indexOf("a ");
        int thirdA = s.indexOf("a C");
      //  int forthA = s.indexOf("ava W");
      //  int forthA = s.lastIndexOf("av");
        int forthA = s.indexOf("Ca") + 1;
       // int forthA = s.lastIndexOf("va")+1;
        int fifthA = s.lastIndexOf("a W");
        int sixthA = s.lastIndexOf("aw");
       // int seventhA = s.indexOf("a o");
        int seventhA = s.lastIndexOf("a ");


        System.out.println("firstA = " + firstA);
        System.out.println("lastA = " + lastA);
        System.out.println("secondA = " + secondA);
        System.out.println("thirdA = " + thirdA);
        System.out.println("forthA = " + forthA);
        System.out.println("fifthA = " + fifthA);
        System.out.println("sixthA = " + sixthA);
        System.out.println("seventhA = " + seventhA);



    }
}
