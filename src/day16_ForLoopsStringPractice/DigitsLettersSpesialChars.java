package day16_ForLoopsStringPractice;

public class DigitsLettersSpesialChars {
    public static void main(String[] args) {

        String str = "Cydeo12345School! @#$%WoddenSpoon";

        String digits = "";
        String letters = "";
        String specialChars = "";

        for (int i = 0; i <= str.length()-1; i++) {//i: index numbers of str (0~last index)

            char ch = str.charAt(i);//ch: each character that we have in str

            if (ch >= '0' && ch <= '9'){//if rhe character is between '0' to '9',then it's digit
                digits += ch;
            }else if (ch >= 'A' && ch <= 'Z'){//if rhe character is between 'A' to 'Z',then it's letter
                letters += ch;
            }else if (ch >= 'a' && ch <= 'z'){//if rhe character is between 'a' to 'z',then it's letter
                letters += ch;
            }else {//if the character is neither digit or letter,then it's special character
                if (ch != ' ') {//if the special character is not a space
                    specialChars += ch;
                }
            }

        }
        System.out.println("digits = " + digits);;
        System.out.println("letters = " + letters);
        System.out.println("specialChars = " + specialChars);
    }
}
