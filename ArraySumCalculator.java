public class ArraySumCalculator {

    // Method to calculate the sum of elements in an array
    public static int calculateSum(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Define an integer array
        int[] myArray = {5, 10, 15, 20, 25};

        // Call the method and store the result
        int totalSum = calculateSum(myArray);

        // Display the result
        System.out.println("Sum of array elements: " + totalSum);
    }
}
