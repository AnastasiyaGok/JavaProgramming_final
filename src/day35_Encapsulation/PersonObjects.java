package day35_Encapsulation;

public class PersonObjects {
    public static void main(String[] args) {

        Person person1 = new Person("Anna", 35, 'F', "Russian");

        System.out.println(person1);
        Person.printPlanetName();
        person1.eat(" pizza");
        person1.drink(" water");



    }
}
