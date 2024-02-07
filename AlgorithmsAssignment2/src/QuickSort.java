public class QuickSort extends SortingAlgorithm {
    int[] sorty(int[] arr) {

        quickSort(arr, 0, arr.length - 1);
        return arr;
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array, arr[pivotIndex] is now in the correct place
            int pivotIndex = partition(arr, low, high);


            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        // Traverse the array and rearrange elements such that elements smaller than the pivot
        // are moved to the left, and elements greater than the pivot are moved to the right
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        // Place the pivot in its correct position
        swap(arr, i + 1, high);

        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    void testMessage() {
        System.out.println("\n Quick Sort \n");
    }
}