class DOB {
    int date;
    int month;
    int year;

    DOB(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return "DOB: " + date + "-" + month + "-" + year;
    }
}

class Student {
    int id;
    String name;
    DOB dateOfBirth;

    Student(int id, String name, DOB dateOfBirth) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;

    }

    public String toString() {
        return "name: " + name + "\nid: " + id + "\n" + dateOfBirth;
    }

}

public class compositionExample {
    public static void main(String[] args) {
        DOB d1 = new DOB(07, 05, 2007);
        Student s1 = new Student(1234, "alice", d1);
        System.out.println(s1);

    }
}
