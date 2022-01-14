package day32_Constructor;

public class CostructorCalls {

    public CostructorCalls(){
        System.out.println("Default Constructor");
    }
    public CostructorCalls(int a){
        this();//Default Constructor
        System.out.println("Constructor with int argument");
    }
    public CostructorCalls(String str){
        this(10);//Default Constructor, Constructor with int argument
        System.out.println("Constructor with String argument");
    }

    public static void main(String[] args) {

        CostructorCalls obj1 = new CostructorCalls();

        System.out.println("---------------------------------------------------------------");

        CostructorCalls obj2 = new CostructorCalls(10);

        System.out.println("---------------------------------------------------------------");

        CostructorCalls obj3 = new CostructorCalls("Java");

    }
}
