public class Overload {
    // method with two int parameters
    public int add(int a, int b) {
        return (a + b);
    }
    // method with three double parameters
    public double add(double a, double b, double c) {
        return (a + b + c);
    }
    public static void main(String[] args) {
        // now we create instance of our class to use here
        Overload insobject = new Overload();
        // Calling the add method with two parameters
        int sumInt = insobject.add(5, 10);
        System.out.println("Sum of 2 integers: " + sumInt);

        // Calling the add method with 3 parameters
        double sumDouble = insobject.add(2.5, 3.7, 1.2);
        System.out.println("Sum of 3 doubles: " + sumDouble);
    }
}