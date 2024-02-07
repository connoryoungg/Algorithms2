import java.util.Random;

public class Tester {
SortingAlgorithm algorithm;
    Tester(SortingAlgorithm sa) {
        algorithm = sa;
    }
    int[] kSortedArray(int size, int k) {

        int[] sortedArray = new int[size];
        for (int i = 0; i < size; i++) {
            sortedArray[i] = i + 1;
        }

        Random rand = new Random();
        for (int i = 0; i < size; i++) {

            int start = Math.max(0, i - k);
            int end = Math.min(size - 1, i + k);

            int randomIndex = rand.nextInt(end - start + 1) + start;
            int temp = sortedArray[i];
            sortedArray[i] = sortedArray[randomIndex];
            sortedArray[randomIndex] = temp;
        }

        return sortedArray;
    }
    double singleTest(int size) {
        int[] testArr = new int[size];
        Random rand = new Random();

            for (int i = 0; i < size; i++) {
                testArr[i] = rand.nextInt();;
            }
        double startTime = System.nanoTime();
            algorithm.sorty(testArr);

        double estimatedTime = System.nanoTime() - startTime;
        return (estimatedTime / 1000000);
    }

    double singleTestK(int size) {
        int[]testArr = kSortedArray(size, 10);
        double startTime = System.nanoTime();
        algorithm.sorty(testArr);
        double estimatedTime = System.nanoTime() - startTime;

        return (estimatedTime / 1000000);
    }
    void printTestMessage() {
        algorithm.testMessage();
    }
    void test(int iterations, int size) {
        double totalTime = 0;
        for(int i = 0; i < iterations; i++) {
            totalTime += singleTest(size);

        }
        System.out.println("Sorted " + size + " elements in " + totalTime + " ms");
    }

    void testK(int iterations, int size) {
        double totalTime = 0;
        for(int i = 0; i < iterations; i++) {
            totalTime += singleTestK(size);

        }
        System.out.println("Sorted " + size + " elements in " + totalTime + " ms");
    }
}
