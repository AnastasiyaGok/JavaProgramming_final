package day17_Whyle_DowHile;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "AABBCC";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            // char ch = str.charAt(i);
            String ch = ""+ str.charAt(i); // "A", "A", "B", "B", "C", "C"
            //if(result.contains(""+ch)){
            if (result.contains(ch)){//if the result already contains rhe character
                continue; // skips
            }
            result += ch;
        }
        System.out.println(result);


    }
}
