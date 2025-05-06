package DSA.GeeksForGeeks.Arrays;

public class MaxSubArraySumWithoutInbuilt {
    public static int maxSubArraySum(int[] arr) {
        int maxSoFar = arr[0];
        int currentMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            // Replace Math.max(arr[i], currentMax + arr[i])
            if (currentMax + arr[i] > arr[i]) {
                currentMax = currentMax + arr[i];
            } else {
                currentMax = arr[i];
            }

            // Replace Math.max(maxSoFar, currentMax)
            if (currentMax > maxSoFar) {
                maxSoFar = currentMax;
            }
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 3, -8, 7, -1, 2, 3};
        int[] arr2 = {-2, -4};
        int[] arr3 = {5, 4, 1, 7, 8};

        System.out.println(maxSubArraySum(arr1)); // Output: 11
        System.out.println(maxSubArraySum(arr2)); // Output: -2
        System.out.println(maxSubArraySum(arr3)); // Output: 25
    }
}

