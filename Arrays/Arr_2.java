public class Arr_2 {
    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static int search(int marks[], int key) {
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int Maximum(int numbers[]) {
        int max = Integer.MIN_VALUE; // - infinity
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static int Minimum(int numbers[]) {
        int min = Integer.MAX_VALUE; // + infinity
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    public static int binarySearch(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (numbers[mid] == key) {
                return mid;
            } else if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void reverse(int numbers[]) {
        int start = 0, last = numbers.length - 1;
        while (start < last) {
            int temp = numbers[start];
            numbers[start] = numbers[last];
            numbers[last] = temp;
            start++;
            last--;
        }
    }

    public static void printPairs(int numbers[]) {
        int tp = 0;
        for (int i = 0; i < numbers.length; i++) {
            int curr = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.println("(" + curr + "," + numbers[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs :" + tp);
    }

    public static void printSubArrays(int numbers[]) {
        int ts = 0;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                }
                ts++;
                System.out.println();
            }
        }
        System.out.println("Total SubArrays :" + ts);
    }

    public static void main(String[] args) {
        int marks[] = { 97, 98, 99 };
        update(marks); // Call by reference

        // Traversal of an array
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();

        // Linear Search in an array
        int key = 99;
        int index = search(marks, key);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }

        // Maximum and Minimum in an array
        int numbers[] = { 5, 2, 8, 1, 9 };
        System.out.println("Maximum element in the array: " + Maximum(numbers));
        System.out.println("Minimum element in the array: " + Minimum(numbers));
        int key1 = 8;
        int index1 = binarySearch(numbers, key1);
        if (index1 != -1) {
            System.out.println("Element found at index: " + index1);
        } else {
            System.out.println("Element not found");
        }

        // Reverse an array
        reverse(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        System.out.println("Pairs in the array:");
        printPairs(numbers);

        System.out.println("SubArrays in the array:");
        printSubArrays(numbers);
    }
}
// Time Complexity of Linear Search: O(n), where n is the number of elements in
// the array. In the worst case, we may have to check all elements in the array
// to find the key or determine that it is not present.

// Time Complexity of Maximum and Minimum: O(n), where n is the number of
// elements in the array. We need to traverse the entire array to find the
// maximum and minimum values.

// Time Complexity of Binary Search: O(log n), where n is the number of
// elements in the array. Binary search works on sorted arrays and reduces the
// search space by half in each iteration, resulting in logarithmic time
// complexity.

// Time Complexity of Reverse: O(n), where n is the number of elements in the
// array. We need to traverse half of the array to swap elements from both ends.

// Time Complexity of Print Pairs: O(n^2), where n is the number of elements in
// the array. We have nested loops to generate all possible pairs of elements in
// the array.
