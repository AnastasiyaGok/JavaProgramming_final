package day37_Inheritance.phoneTask;

public class PhoneShop {
    public static void main(String[] args) {

        Iphone iphone = new Iphone("13 Pro", "6.6 inches", 1300, "Light blue");

        Samsung samsung = new Samsung("Galaxy S19", "6 inches", 900,"White");

        Nokia nokia = new Nokia("Brick", "4 inches", 50, "Gray");

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        iphone.call(2069453669);
        iphone.text(2069453669);
        iphone.faceTime("anastasiyagok81@hotmail.com");

        System.out.println("------------------------------------------------------------------");

        samsung.call(911);
        samsung.text(123456789);
        samsung.freeze();

        System.out.println("------------------------------------------------------------------");

        nokia.call(911);
        nokia.text(123456789);
        nokia.selfDefense();

        System.out.println("------------------------------------------------------------------");

        System.out.println(Phone.hasBattery);
        System.out.println(Iphone.hasBattery);
        System.out.println(Samsung.hasBattery);
        System.out.println(Nokia.hasBattery);

    }
}
