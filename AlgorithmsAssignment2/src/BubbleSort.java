public class BubbleSort extends SortingAlgorithm {
    int[] sorty(int[] arr) {

            int i;
            int n = arr.length;
            int j;
            int temp;
            boolean swapped;
            for (i = 0; i < n - 1; i++) {
                swapped = false;
                for (j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {


                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                        swapped = true;
                    }
                }
                if (swapped == false)
                    break;
            }
            return arr;
    }
    void testMessage() {
        System.out.println("\n Bubble Sort \n");
    }

}
