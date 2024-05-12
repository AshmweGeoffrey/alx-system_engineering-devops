// Parent class
class Animal {
    // States
    int legs;
    int eyes;
    String name;

    // Constructor
    public Animal(int legs, int eyes, String name) {
        this.legs = legs;
        this.eyes = eyes;
        this.name = name;
    }

    // Behaviors
    public void move() {
        System.out.println(name + " is moving.");
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void dance() {
        System.out.println(name + " is dancing.");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    // Constructor
    public Dog(int legs, int eyes, String name) {
        super(legs, eyes, name);
    }

    // Accessing states and behaviors from parent class
    public void accessStatesAndBehaviors() {
        System.out.println("Eyes: " + eyes);
        System.out.println("Name: " + name);
        move();
        dance();
        eat();
    }
}

public class ExamInheritanceDemo {
    public static void main(String[] args) {
        // Creating an instance of Dog
        Dog myDog = new Dog(4, 2, "Buddy");

        // Accessing states and behaviors of the child class
        myDog.accessStatesAndBehaviors();
    }
}