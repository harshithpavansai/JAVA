class Citizen {
    String Aadhar;
    String firstName;
    String lastName;
    int age;
    char Gender;
    String city;

    public Citizen(String aadhar, String firstName, String lastName, int age, char gender, String city) {
        Aadhar = aadhar;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        Gender = gender;
        this.city = city;
    }

    Citizen() {

    }

    Citizen(String a) {
        Aadhar = a;
    }

    Citizen(String a, String b) {
        firstName = a;
        lastName = b;
    }

    Citizen(String a, String b, int c) {
        firstName = a;
        lastName = b;
        age = c;
    }

    Citizen(char a, String b, String c) {
        Gender = a;
        city = b;
        lastName = c;
    }

    Citizen(char a) {
        Gender = a;
    }

    void printDetails() {
        System.out.println(Aadhar);
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(age);
        System.out.println(Gender + "...");
        System.out.println(city);
    }

}

public class Citizenex {
    public static void main(String[] args) {
        Citizen c1 = new Citizen();
        Citizen c2 = new Citizen("7872 6167 8752");
        Citizen c3 = new Citizen("pedapudi", "pavan sai harshith");
        Citizen c4 = new Citizen("pedapudi", "pavan sai harshith", 18);
        Citizen c5 = new Citizen('M', "Rajahmundry", "harshith");
        Citizen c6 = new Citizen('M');
        c1.printDetails();
        System.out.println();
        c2.printDetails();
        System.out.println();
        c3.printDetails();
        System.out.println();
        c4.printDetails();
        System.out.println();
        c5.printDetails();
        System.out.println();
        c6.printDetails();
    }

}
