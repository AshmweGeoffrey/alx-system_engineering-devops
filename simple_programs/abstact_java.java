abstract class Animal {
    // States
    protected String species;
    protected int age;
    protected boolean isHungry;

    // Constructor which has same name as class_name
    public Animal(String species, int age) {
        this.species = species;
        this.age = age;
        this.isHungry = false; // Animals are not hungry by default
    }

    // Abstract method for eating behavior of dog
    abstract void eat();

    // Abstract method for sleeping behavior
    abstract void sleep();

    // Method to display animal information
    public void displayInfo() {
        System.out.println("Species: " + species);
        System.out.println("Age: " + age + " years old");
        System.out.println("Hungry: " + (isHungry ? "Yes" : "No"));
    }
}

class Dog extends Animal {
    // Constructor
    public Dog(String species, int age) {
	    // here we call baseclass to use its constructor
        super(species, age);
    }

    // Implementing eat behavior for Dog from parent class(override)
    void eat() {
        System.out.println("Dog is eating.");
        isHungry = false; // After eating, set hungry to false
    }

    // Implementing sleep behavior for Dog from baseclass (override)
    void sleep() {
        System.out.println("Dog is sleeping.");
    }
}

class Cat extends Animal {
    // Constructor
    public Cat(String species, int age) {
        super(species, age);
    }

    // Implementing eat behavior for Cat(override)
    void eat() {
        System.out.println("Cat is eating.");
        isHungry = false; // After eating, set hungry to false
    }

    // Implementing sleep behavior for Cat(override)
    void sleep() {
        System.out.println("Cat is sleeping.");
    }
}

public class abstact_java{
    public static void main(String[] args) {
        // Creating a Dog object from animal as baseclass
        Animal dog = new Dog("Dog", 3);
        System.out.println("Dog:");
        dog.displayInfo();
        dog.eat(); // Dog eating
        dog.sleep(); // Dog sleeping
        System.out.println();

        // Creating a Cat object from animal as baseclass
        Animal cat = new Cat("Cat", 2);
        System.out.println("Cat:");
        cat.displayInfo();
        cat.eat(); // Cat eating
        cat.sleep(); // Cat sleeping
    }
}
