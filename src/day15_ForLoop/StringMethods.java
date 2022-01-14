package day15_ForLoop;

public class StringMethods {
    public static void main(String[] args) {

        String str = "  ";
        boolean r = str.isEmpty();
        System.out.println(r);

        boolean r1 = str.isBlank();
        System.out.println(r1);

        String str2 = "Cydeo   ";
        System.out.println(str2.isBlank());

        System.out.println("--------------------------------------------------");

        String s1 = "CYDEO";
        String s2 = "cydeo";
        System.out.println(s1.equals(s2)); // false
        System.out.println(s1.equalsIgnoreCase(s2)); // true

        System.out.println("---------------------------------------------------");

        String sentence = "My favorite programming language is Java";

        boolean hasCSharp = sentence.contains("C#");
        boolean hasJava = sentence.contains("Java");
        boolean hasJava2 = sentence.contains("java");
        boolean hasJava3 = sentence.toLowerCase().contains("java");
        boolean r2 = sentence.contains("java") || sentence.contains("Java");

        System.out.println(hasCSharp);
        System.out.println(hasJava);
        System.out.println(hasJava2);
        System.out.println(hasJava3);
        System.out.println(r2);

        System.out.println("---------------------------------------------------");

        String input1 = "I Love Java";
        String input2 = "Java";

        System.out.println(input1.equals(input2)); // false
        System.out.println(input1.equalsIgnoreCase(input2)); //false

        System.out.println(input1.contains("Java")); // true

        String input3 = "I Lave jAvA";
        System.out.println(input3.toLowerCase().contains("java")); //true
        System.out.println(input3.toUpperCase().contains("JAVA")); //true

        System.out.println("-----------------------------------------------------");

        String a = "Wooden Spoon";
        boolean x = a.startsWith("Woo");
        boolean y = a.endsWith("Spoon");
        boolean z = a.toLowerCase().startsWith("wooden");//in order to ignore the case sensitivity we first create the lower or upper case versionof string

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);










    }
}
