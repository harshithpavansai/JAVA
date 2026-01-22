abstract class Animal {
    abstract void makeSound(); // abstract method
}

class Cat extends Animal { // extending an abstract class
    @Override
    void makeSound() {
        System.out.println("meow meow.....");
    }
}

class Dog extends Animal { // extending an abstract class
    @Override
    void makeSound() {
        System.out.println("bhow bhow.....");
    }
}

abstract class Bank {
    abstract double getInterestRateOnPersonalLoan();
}

class SBI extends Bank {
    @Override
    double getInterestRateOnPersonalLoan() {
        return 7.7;
    }
}

abstract class Polygon {
    abstract void printArea();

    abstract void printPerimeter();
}

class Square extends Polygon {
    int side;

    Square(int side) {
        this.side = side;
    }

    @Override
    void printArea() {
        System.out.println(side * side);
    }

    @Override
    void printPerimeter() {
        System.out.println(4 * side);
    }
}

class Rectangle extends Polygon {
    int length;
    int breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    void printArea() {
        System.out.println(length * breadth);
    }

    void printPerimeter() {
        System.out.println(2 * (length + breadth));
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        SBI s1 = new SBI();
        System.out.println(s1.getInterestRateOnPersonalLoan());
        Dog d1 = new Dog();
        d1.makeSound();
        Cat c1 = new Cat();
        c1.makeSound();
        Square s2 = new Square(10);
        s2.printArea();
        s2.printPerimeter();
        System.out.println("------------------------");
        Rectangle r1 = new Rectangle(20, 10);
        r1.printArea();
        r1.printPerimeter();
        System.out.println("------------------------");
        
    }
}