class person{
    String name;
    int age;
    char gender;
    void walks(){
        System.out.println(name+" is walking...");
    }
    void read(){
        System.out.println(name+" is reading...");
    }
}
class employee extends person{
    String empId;
    double salary;
}
class occupation extends employee{
    
}
public class multipleInheritance {
    
}
