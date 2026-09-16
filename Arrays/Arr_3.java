public class Arr_3 {

    // Brute Force Approach
    public static void maxSubArrays1(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) { // print
                    // SubArray Sum
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Maximum SubArray Sum :" + maxSum);
    }

    // Prefix Sum Approach
    public static void maxSubArrays2(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        // Calculate Prefix Array
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;

                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Maximum SubArray Sum :" + maxSum);
    }

    // Kadane's Algorithm
    public static void Kadanes(int numbers[]) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            cs += numbers[i];
            if (cs < 0) {
                cs = 0;
            }
            /*
             * if(cs>ms){
             * ms=cs;
             * }
             */
            ms = Math.max(cs, ms);
        }
        System.out.println("Maximum SubArray Sum :" + ms);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        maxSubArrays1(numbers);
        maxSubArrays2(numbers);
        Kadanes(numbers);
    }
}

// Time Complexity of SubArray Sum: O(n^3), where n is the number of elements in the array.

// Time Complexity of Prefix Sum: O(n^2), where n is the number of elements in the array.

// Time Complexity of Kadane's Algorithm: O(n), where n is the number of elements in the array.
