package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {
        String firstName = "Cydeo";
        String lastName = "School";
        int age = 45;
        String jobTitle = "SDET";
        String companyName = "Apple Inc";
        double salary = 100000.58;

        String fullName = firstName + " " + lastName;

        //Full name of the person is____

        System.out.println("Full name of the person is " + fullName);
         //___is__years old

        System.out.println(fullName + " is " + age + " years old" );
        //FullName is JobTitle, works at CompanyName, and Fullname's salary is____

        System.out.println(fullName + " is " + jobTitle +", works at " + companyName
                +", and " + fullName +"'s salary is $" + salary);

    }
}
