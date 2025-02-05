public class Demo062{
    public static void main(String[] args) {
        // Sample array
        int[] arr = {10, 20, 30, 40, 50};

        // Check if the array has at least 2 elements
        if (arr.length > 1) {
            // Print 1st, 2nd and last element
            System.out.println("1st Element: " + arr[0]);
            System.out.println("2nd Element: " + arr[1]);
            System.out.println("Last Element: " + arr[arr.length - 1]);
        } else {
            System.out.println("Array doesn't have enough elements.");
        }
    }
}
