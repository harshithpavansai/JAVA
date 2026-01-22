abstract class Animal {
    String SpeciesType;

    Animal(String SpeciesType) {
        this.SpeciesType = SpeciesType;
    }

    abstract void makeSound();

}

class dog extends Animal {
    String breed;

    dog(String breed, String SpeciesType) {
        super(SpeciesType);
        this.breed = breed;
    }

    void makeSound() {
        System.out.println("woof");
    }
}

public class AbstractClassExample2 {
    public static void main(String[] args) {
        dog d1 = new dog("lab", "carnivores");
        System.out.println(d1.SpeciesType);
        System.out.println(d1.breed);
        d1.makeSound();
        //if a class extends an abstract class , it is forced to give implementation for all abstract methods present......
        //....in the parent class if the child is failed to do so, then it also must be tagged as abstract class

    }

}
