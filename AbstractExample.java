abstract class Animal {
    abstract void makeSound();
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bhow Bhow");
    }
}

abstract class Bank {
    abstract double getIntrest();
}

class SBI extends Bank {
    @Override
    double getIntrest() {
        return 7.7;
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        SBI s1 = new SBI();
        System.out.println(s1.getIntrest());
        Dog d1 = new Dog();
        d1.makeSound();
    }

}
