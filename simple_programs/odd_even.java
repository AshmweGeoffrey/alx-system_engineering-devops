public class odd_even {
    public static void main(String[] args) {
        System.out.println("Even numbers between 5 and 49:");
        for (int i = 6; i <= 48; i += 2) {
            System.out.print(i + " ");
        }
        
        System.out.println("\nOdd numbers between 5 and 49:");
        for (int i = 5; i <= 49; i += 2) {
            System.out.print(i + " ");
        }
    }
}
