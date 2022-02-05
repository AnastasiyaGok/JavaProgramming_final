package day38_Inheritance.day36_Inheritance.employeeTask;

public class EmployeeTeam {
    public static void main(String[] args) {

        Tester tester = new Tester();
        tester.setInfo("Ipek", 'F',23, "QA", 36, 110000, "Amazon INC");
        tester.work();

        System.out.println(tester);

        Developer developer = new Developer();
        developer.setInfo("Gul", 'F', 46, "SDET", 47, 125000, "Cydeo");
        developer.work();

        System.out.println(developer);

        Driver driver = new Driver();
        driver.setInfo("Ali", 'M', 35, "Driver", 36, 115000, "J.B.Hunt");
        driver.work();

        System.out.println(driver);

        Teacher teacher = new Teacher();
        teacher.setInfo("Fatih", 'M', 37, "Math Teacher", 23, 95000, "Lisa");
        teacher.work();

        System.out.println(teacher);





    }
}
