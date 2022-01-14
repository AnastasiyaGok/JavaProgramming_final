package day10_NestedIf;

public class FieldTrip {
    public static void main(String[] args) {

        int grade = 2;
        String location = "";
        int groupNumber = 0;
        String teacher = "";


        if (grade >= 1 && grade <= 6) {

            if (grade == 1) {
                location = "Apple Orshard";
                groupNumber = 3;
                teacher = "Mr. Smith";
            } else if (grade == 2) {
                location = "Zoo";
                groupNumber = 7;
                teacher = "Mr. Lee";
            } else if (grade == 3) {
                location = "Aquarium";
                groupNumber = 5;
                teacher = "Ms.Wilson";
            }else if (grade == 4){
                location = "Movie Theater";
                groupNumber = 2;
                teacher = "Ms. Reyes";
            }

        }else {
            System.out.println("Invalid Grade");
        }
        System.out.println("location - "+location+"\nnumber of group - "+groupNumber+"\nteacher in charge - "+teacher );

    }
}
