class Subject {
    String name;
    String type;
    int credits;

    Subject(String name, String type, int credits) {
        this.name = name;
        this.type = type;
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "Subject(" + name + ", " + type + ", " + credits + ")";
    }
}

class Branch {
    String name;
    String bhavan;
    int floor;
    String hod;
    int code;

    Branch(String name, String bhavan, int floor, String hod, int code) {
        this.name = name;
        this.bhavan = bhavan;
        this.floor = floor;
        this.hod = hod;
        this.code = code;
    }

    @Override
    public String toString() {
        return "branch(" + name + ", " + hod + ", " + bhavan + ", " + code + ")";
    }
}

class Student {
    String rollNumber;
    String name;
    int age;
    Branch branch;
    Subject[] subs;

    Student(String rollNumber, String name, int age, Branch branch, Subject[] subs) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.branch = branch;
        this.subs = subs;
    }

    void showStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Branch: " + branch);
        for (Subject sub : subs) {
            System.out.println(sub);
        }
    }
}

public class compositionExample3 {
    public static void main(String[] args) {
        Branch b1 = new Branch("ECE", "Ratan tata", 3, "xyz", 4);
        Subject[] subs = {
                new Subject("java", "Theory", 3),
                new Subject("python", "lab", 1)
        };
        Student s1 = new Student("24P31A05J2", "pavan", 19, b1, subs);
        s1.showStudentDetails();

    }

}
