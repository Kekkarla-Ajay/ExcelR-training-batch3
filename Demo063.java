public class Demo063{
    public static void main(String[] args) {
        // Sample array
        int[] arr = {10, 20, 30, 40, 50};

        // Check if the array has at least one element
        if (arr.length > 0) {
            // Add the first and last element
            int sum = arr[0] + arr[arr.length - 1];
            System.out.println("Sum of the 1st and last element: " + sum);
        } else {
            System.out.println("Array is empty.");
        }
    }
}
