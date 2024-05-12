// Interface for Parent1
interface Parent1 {
    void setProperty1(int property1);
}

// Interface for Parent2
interface Parent2 {
    void setProperty2(String property2);
}

// Interface for Parent3
interface Parent3 {
    void setProperty3(double property3);
}

// Child class implementing Parent1, Parent2, and Parent3 interfaces
class Child implements Parent1, Parent2, Parent3 {
    private int property1;
    private String property2;
    private double property3;

    public void setProperty1(int property1) {
        this.property1 = property1;
    }

    public void setProperty2(String property2) {
        this.property2 = property2;
    }

    public void setProperty3(double property3) {
        this.property3 = property3;
    }

    // Method to display properties
    public void displayProperties() {
        System.out.println("Property 1: " + property1);
        System.out.println("Property 2: " + property2);
        System.out.println("Property 3: " + property3);
    }
}

public class inheritance_java {
    public static void main(String[] args) {
        // Creating an instance of Child class
        Child child = new Child();
        child.setProperty1(10);
        child.setProperty2("Hello");
        child.setProperty3(3.14);

        // Displaying properties of the Child class
        child.displayProperties();
    }
}
