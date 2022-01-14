package day10_NestedIf;

public class CharacterIdentify {
    public static void main(String[] args) {

        char ch = '@';//or 65

        if (ch >= '0' && ch <= '9'){ // or 48-57
            System.out.println("Digital");
        }else if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')){ // or 65-90,97-122
            System.out.println("Alphabetic");
        }else {
            System.out.println("Special Character");
        }

    }
}
