public class Fibonacci {
    public static void main(String[] args) {
        int terms = 10; // Change this to print more Fibonacci numbers
        int first = 0, second = 1; // First two Fibonacci numbers

        System.out.print("Fibonacci series: ");

        // Loop to generate Fibonacci series
        for (int i = 0; i < terms; i++) {
            System.out.print(first + " "); // Print current number
            
            // Calculate next Fibonacci number
            int next = first + second;
            first = second; // Move to the next term
            second = next;
        }
    }
}