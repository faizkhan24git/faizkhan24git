public class Factorial {
    public static void main(String[] args) {
        int num = 5; // Change this number to find factorial of another number
        int fact = 1; // Start with 1 because factorial of 0 and 1 is 1

        // Multiply numbers from 1 to num
        for (int i = 1; i <= num; i++) {
            fact *= i; // fact = fact * i
        }

        // Print the result
        System.out.println("Factorial of " + num + " is: " + fact);
    }
}
