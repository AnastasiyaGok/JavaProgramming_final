package day37_Inheritance.scrumTask;

public class AmazonInc {
    public static void main(String[] args) {

        String company = "Amazon Inc";

        ProductOwner po = new ProductOwner("Suhaib", 29, 'M', 1, 160000, company);

        BusinessAnalyst ba = new BusinessAnalyst("Cihad", 30, 'M', 2, 150000, company);

        ScrumMaster sm = new ScrumMaster("Anel", 26, 'F', 3, 145000, company);

        Tester tester1 = new Tester("Chinara", 32, 'F', "QA", 1415, 125000, company);
        Tester tester2 = new Tester("Yasaman", 31, 'F', "QA", 1416, 130000, company);
        Tester tester3 = new Tester("Irena", 29, 'F', "QA", 1417, 128000, company);
        Tester tester4 = new Tester("Cihad", 26, 'M', "QA", 1418, 125000, company);
        Tester[] testers = {tester1, tester2, tester3, tester4};

        Developer developer1 = new Developer("Daniela", 27, 'F', "Java Developer", 8, 135000, company);
        Developer developer2 = new Developer("Max", 40, 'M', "Junior Java Developer", 9, 135000, company);
        Developer developer3 = new Developer("Allison", 26, 'F', "Java Developer", 10, 135000, company);
        Developer developer4 = new Developer("Manas", 41, 'M', "Full Stuck Developer", 11, 135000, company);
        Developer developer5 = new Developer("Evelyn", 33, 'F', "JS Developer", 12, 135000, company);
        Developer[] developers = {developer1, developer2, developer3, developer4, developer5};

        ScrumTeam scrumTeam = new ScrumTeam(po, ba, sm);

        scrumTeam.addTesters(testers);
        scrumTeam.addDevelopers(developers);

        System.out.println(scrumTeam);

        System.out.println("--------------------------------------------------------------------------");

        for (Tester tester : scrumTeam.testers) {
            System.out.println(tester.name+": "+tester.salary);
        }

        System.out.println("--------------------------------------------------------------------------");

        for (Developer developer : scrumTeam.developers) {
            System.out.println(developer.name+": "+developer.salary);
        }





    }
}
/*
 Create a class named AmazonInc:

			create the objects of ProductOwner, ScrumMaster, and BusinessAnalyst
			Create 4 objects of Testers
			Create 5 Objects of Developers

			Create an object of ScrumTeam

			Add the ProductOwner, ScrumMaster, and BusinessAnalyst, Testers and Developers object into the scrum team


 */
