public class Demo060{
    public static void main(String[] args) {
        int n = 20; // number of Fibonacci numbers to print
        long first = 0, second = 1;

        System.out.println("Fibonacci Series of " + n + " numbers:");

        // Print the Fibonacci series
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            long next = first + second;  // Calculate the next Fibonacci number
            first = second;              // Move to the next pair
            second = next;
        }
    }
}
