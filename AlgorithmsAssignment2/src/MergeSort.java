public class MergeSort extends SortingAlgorithm {
    int[] sorty(int[] arr) {
        int length = arr.length;

        if (length > 1) {
            int mid = length / 2;

            // Divide the array into two halves
            int[] leftArray = new int[mid];
            int[] rightArray = new int[length - mid];

            // Copy elements to the left and right subarrays
            for (int i = 0; i < mid; i++) {
                leftArray[i] = arr[i];
            }
            for (int i = mid; i < length; i++) {
                rightArray[i - mid] = arr[i];
            }

            // Recursively sort each half
            sorty(leftArray);
            sorty(rightArray);

            // Merge the sorted halves
            merge(arr, leftArray, rightArray);
        }
        return arr;
    }

    private static void merge(int[] result, int[] leftArray, int[] rightArray) {
        int i = 0, j = 0, k = 0;

        // Merge the two halves into the result array in sorted order
        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] <= rightArray[j]) {
                result[k++] = leftArray[i++];
            } else {
                result[k++] = rightArray[j++];
            }
        }

        // Copy the remaining elements, if any, from leftArray
        while (i < leftArray.length) {
            result[k++] = leftArray[i++];
        }

        // Copy the remaining elements, if any, from rightArray
        while (j < rightArray.length) {
            result[k++] = rightArray[j++];
        }
    }
    void testMessage() {
        System.out.println("\n Merge Sort \n");
    }
}

