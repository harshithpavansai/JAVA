class Animal {
    void makeSound() {
        System.out.println("Animal is making a sound");
    }
}nrjkbgjkregbjkr

class cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("meoww....");
    }
}

class dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("woof....");
    }
}

public class methodOverRidingExample {
    static void validateAnimal(Animal x) {
        if (x instanceof cat) {
            System.out.println("It's a cat");
        } else if (x instanceof dog) {
            System.out.println("It's a dog");
        }
    }

    public static void main(String[] args) {
        // Animal a1 = new Animal();
        // a1.makeSound();
        // cat c1 = new cat();
        // c1.makeSound();
        // dog d1 = new dog();
        // d1.makeSound();
        Animal a1 = new cat();
        Animal a2 = new dog();
        validateAnimal(a1);
        validateAnimal(a2);

    }

}
