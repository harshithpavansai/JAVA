class person {
    String name;
    int age;
    char gender;

    void walk() {
        System.out.println("Walking.....");
    }

    void read() {
        System.out.println("Reading.....");
    }

    void printDetails() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
    }
}

class employee extends person {
    String empId;
    double salary;

    void applyLeave() {
        System.out.println("Applying for a leave...");
    }
}

class student extends person {
    String rollNumber;
    String branch;
    double cgpa;

    void takeExam() {
        System.out.println("Taking a exam.....");
    }
}

class details {
    public static void main(String[] args) {
        employee e1 = new employee();
        e1.name = "pavan";
        e1.age = 25;
        e1.gender = 'M';
        e1.empId = "123";
        e1.salary = 60000;
        e1.printDetails();
        e1.walk();
        e1.applyLeave();
        System.out.println("------------------------------------");
        student s1 = new student();
        s1.name = "harsith";
        s1.age = 17;
        s1.gender = 'M';
        s1.printDetails();
        s1.takeExam();
    }
}
