package day24_CustomMethod_Return;

public class BreakfastTasks {
    public static void main(String[] args) {
        initials("Cydeo", "School");
        System.out.println("-----------------------------------------------------");

        domain("Cydeo.School@gmail.com");
        System.out.println("-----------------------------------------------------");

        String[] emails = {"josh@gmail.com", "Jim@yahoo.com", "Elminur@cydeo.com", "Gulsen@gmail.com"};
        for (String email : emails) {
            domain(email);
        }
        System.out.println("------------------------------------------------------------");

        nameOfMonth(120);

        System.out.println("-----------------------------------------------------------");

        nameOfDay(6);

        System.out.println("----------------------------------------------------------------");

        daysInMonth(6);

        System.out.println("---------------------------------------------------------------");

        daysOfMonth("february");

        System.out.println("--------------------------------------------------------------------");

        ageGroup(2);


    }
    public static void initials(String firsName, String  lastName){
        String initial = firsName.charAt(0)+"."+lastName.charAt(0);
        initial = initial.toUpperCase();
        System.out.println("initial = "+initial);
    }

    public  static  void domain(String email){
        String domain = email.substring(email.indexOf("@")+1, email.lastIndexOf("."));
        System.out.println("domain = " + domain);
    }

    public static void nameOfMonth(int number) {
        String name = "";
        if (number >= 1 && number <= 12) {
            name = (number == 1) ? "Jan" : (number == 2) ? "Feb" : (number == 3) ? "Mar" : (number == 4) ? "Apr" : (number == 5) ? "May"
                    : (number == 6) ? "Jun" : (number == 7) ? "Jul" : (number == 8) ? "Aug" : (number == 9) ? "Sep" : (number == 10) ? "Oct"
                    : (number == 11) ? "Nov" : "Dec";
        } else {
            name = "Invalid";
        }
        System.out.println("Month name = " + name);

    }

    public static void nameOfDay(int number){
        String name = "";
        if (number >=1 && number <= 7){
            name = (number == 1)? "Mon" :(number == 2)? "Tue" :(number == 3)? "Wed" :(number == 4)? "Thur"
                    :(number == 5)? "Fri" :(number == 6)? "Sat" : "Sun";
        }else {
            name = "Invalid";
        }
        System.out.println("Day name = " + name);

    }

    public static void daysInMonth(int number){
        switch (number){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days!");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days!");
                break;
            case 2:
                System.out.println("28 days!");
                break;
            default:
                System.out.println("Invalid");
        }

    }

    public static void daysOfMonth(String month){
        int days = 0;
        if (month.equalsIgnoreCase("january") || month.equalsIgnoreCase("march") || month.equalsIgnoreCase("july") ||
            month.equalsIgnoreCase("august")|| month.equalsIgnoreCase("october") || month.equalsIgnoreCase("december")){
            days = 31;
        }else if (month.equalsIgnoreCase("april") || month.equalsIgnoreCase("june") ||
                  month.equalsIgnoreCase("september") || month.equalsIgnoreCase("november")){
            days = 30;
        }else if (month.equalsIgnoreCase("february")){
            days = 28;
        }else {
            System.out.println("Invalid");
        }
        System.out.println("Days in a month = " + days);
    }

    public  static  void ageGroup(int age){
        String result="";
            result = (age<=120)? (age==1||age==2)? "Infant" :(age<=5)? "Toddler" :(age<=9)? "Kid" :
                     (age<=12)? "Pre-Teen" :(age<=17)? "Teenager" :(age<=20)? "Yang Adult" :
                     (age<=39)? "Adult" :(age<=49)? "Young Middle-Aged Adult" :(age<=54)? "Middle-Aged Adult" :
                     (age<=64)? "Very Young Senior Citizen" :(age<=74)? "Young Senior Citizen" :
                     (age<=84)? "Senior Citizen" :"Old Senior Citizen" :"Invalid";

        System.out.println(result);


    }

}
/*
Warmup tasks:
1. Create a method that can display the initials of the person
2. Create a method that can display the domain of the email
3. Create a method that can display the name of the month based on the given number to the method
4. Create a method that can print the name of the day based on the
given number to the method
5. Create a method that can print how many days a month has
6. Create a class called AgeGroups, and write a program that can define the age groups of a person

                 age groups are:
                        infant (1 - 2), Toddler (3 - 5),Kid (6 - 9), Pre-Teen (10 - 12),
                        Teenager (13 - 17),Young Adult (18 - 20),Adult (21 - 39),
                        Young Middle-Aged Adult (40 - 49),Middle-Aged Adult (50 - 54),
                        Very Young Senior Citizen (55 - 64),Young Senior Citizen (65 - 74),
                        Senior Citizen (75 - 84),
                        Old Senior Citizen (85+) (edited)

4

 */