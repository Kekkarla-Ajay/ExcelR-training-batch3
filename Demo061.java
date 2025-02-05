public class Demo061 {
    public static void main(String[] args) {
        int count = 0; // Counter for prime numbers
        int num = 2;   // Starting number to check for primality
        
        while (count < 10) { // Loop until we find 10 prime numbers
            if (isPrime(num)) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) { // Check divisibility up to sqrt(num)
            if (num % i == 0) {
                return false; // Not prime if divisible
            }
        }
        return true; // Prime number
    }
}
