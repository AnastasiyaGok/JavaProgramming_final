package day43_Abstraction.employeeTask;

public class EmployeeObjects {
    public static void main(String[] args) {

        Tester tester = new Tester("Ali", 28, 'M', 32, "SDET", 145000);
        Developer developer = new Developer("Alex", 30, 'M', 42, "Web Developer", 155000);
        Teacher teacher = new Teacher("Angel", 28, 'F', 22, "English Teacher", 85000);
        Driver driver = new Driver("John", 34, 'M', 37, "Lyft Driver", 75000);

        System.out.println(tester);
        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(driver);

        tester.work();
        tester.sleep();
        tester.bugReport();
        tester.eat();

        System.out.println("--------------------------------------------------------------------------");

        developer.work();
        developer.sleep();
        developer.unitRest();
        developer.eat();

        System.out.println("--------------------------------------------------------------------------");

        teacher.work();
        teacher.sleep();
        teacher.eat();

        System.out.println("--------------------------------------------------------------------------");

        driver.work();
        driver.sleep();
        driver.eat();


    }
}
