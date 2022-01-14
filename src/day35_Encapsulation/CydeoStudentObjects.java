package day35_Encapsulation;

public class CydeoStudentObjects {
    public static void main(String[] args) {

        CydeoStudent student1 = new CydeoStudent("Anna", 'F', 35, 12, 45, "Batch 25");

        System.out.println(student1);

        CydeoStudent.printProgrammingLanguage();
        CydeoStudent.printSchoolName();
        CydeoStudent.printSecretCode();
        student1.attendClass();
        student1.study();

    }
}
