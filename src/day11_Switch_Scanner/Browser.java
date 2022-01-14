package day11_Switch_Scanner;

import java.sql.PreparedStatement;

public class Browser {
    public static void main(String[] args) {

        String browserName = "chrome";

        String result = "";

        boolean validBrowser = browserName == "chrome" || browserName == "firefox" || browserName == "opera"
                || browserName == "safari" || browserName == "edge";

        if (validBrowser){
            // 5 Options

            if (browserName == "chrome"){
                result = "Chrom browser is selected";
            }else if(browserName == "firefox"){
                result = "FireFox browser is selected";
            }else if (browserName == "opera"){
                result = "Opera browser is selected";
            }else if (browserName == "safari"){
                result = "Safari browser is selected";
            }else{
                result = "Edge Browser is selected";
            }

        }else{
            result = "Invalid Browser Name";
        }

        System.out.println(result);



    }
}
