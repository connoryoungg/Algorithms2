import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
public class Main {
    public static void main(String args[]) {
        BubbleSort bubble = new BubbleSort();
        QuickSort quick = new QuickSort();
        SelectionSort select = new SelectionSort();
        InsertionSort insert = new InsertionSort();
        ShellSort shell = new ShellSort();
        MergeSort merge = new MergeSort();
        Tester[] testers = new Tester[6];
        testers[0] = new Tester(bubble);
        testers[1] = new Tester(quick);
        testers[2] = new Tester(select);
        testers[3] = new Tester(insert);
        testers[4] = new Tester(shell);
        testers[5] = new Tester(merge);

        //Redirect system out to file.

        //String filePath = "C:\\Users\\conno\\Documents\\!sortingoutput.txt";
        String filePath = "C:\\Users\\conno\\Documents\\!sortingoutputK.txt";

        try {
            // Create a File object representing the output file
            File file = new File(filePath);

            // Create a FileOutputStream to write to the file
            FileOutputStream fileOutputStream = new FileOutputStream(file);

            // Create a PrintStream to redirect System.out to the file
            PrintStream printStream = new PrintStream(fileOutputStream);

            // Redirect System.out to the PrintStream
            System.setOut(printStream);

            // Now, any text written to System.out will be redirected to the file

            //Begin Sorting
/*
            System.out.println("Sort Arrays");
            for (int i = 0; i <= testers.length - 1; i++) {
                testers[i].printTestMessage();
                testers[i].test(20, 100);
                testers[i].test(20, 500);
                testers[i].test(20, 1000);
                testers[i].test(20, 2000);
                testers[i].test(20, 5000);
                testers[i].test(20, 10000);
                testers[i].test(20, 20000);
                testers[i].test(20, 75000);
                testers[i].test(20, 150000);
            }
*/
            System.out.println("Sort k sorted arrays (k = 10)");
            for (int i = 0; i <= testers.length - 1; i++) {
                testers[i].printTestMessage();
                testers[i].testK(20, 100);
                testers[i].testK(20, 500);
                testers[i].testK(20, 1000);
                testers[i].testK(20, 2000);
                testers[i].testK(20, 5000);
                testers[i].testK(20, 10000);
                testers[i].testK(20, 20000);
                testers[i].testK(20, 75000);
                //testers[i].testK(20, 150000);
            }

            /*
            //Quick Sort
            QuickSort quick = new QuickSort();
            Tester tester2 = new Tester(quick);
            System.out.println("Quick Sort");
            tester2.test(20, 100);
            tester2.test(20, 500);
            tester2.test(20, 1000);
            tester2.test(20, 2000);
            tester2.test(20, 5000);
            tester2.test(20, 10000);
            tester2.test(20, 20000);
            tester2.test(20, 75000);
            tester2.test(20, 150000);
            //Selection Sort
            SelectionSort select = new SelectionSort();
            Tester tester3 = new Tester(select);
            System.out.println("Selection Sort");
            tester3.test(20, 100);
            tester3.test(20, 500);
            tester3.test(20, 1000);
            tester3.test(20, 2000);
            tester3.test(20, 5000);
            tester3.test(20, 10000);
            tester3.test(20, 20000);
            tester3.test(20, 75000);
            tester3.test(20, 150000);
            //Insertion Sort
            InsertionSort insert = new InsertionSort();
            Tester tester4 = new Tester(insert);
            System.out.println("Quick Sort");
            tester4.test(20, 100);
            tester4.test(20, 500);
            tester4.test(20, 1000);
            tester4.test(20, 2000);
            tester4.test(20, 5000);
            tester4.test(20, 10000);
            tester4.test(20, 20000);
            tester4.test(20, 75000);
            tester4.test(20, 150000);
            //Shell Sort
            ShellSort shell = new ShellSort();
            Tester tester5 = new Tester(quick);
            System.out.println("Quick Sort");
            tester5.test(20, 100);
            tester5.test(20, 500);
            tester5.test(20, 1000);
            tester5.test(20, 2000);
            tester5.test(20, 5000);
            tester5.test(20, 10000);
            tester5.test(20, 20000);
            tester5.test(20, 75000);
            tester5.test(20, 150000);
            //Merge Sort
            MergeSort merge = new MergeSort();
            Tester tester6 = new Tester(quick);
            System.out.println("Quick Sort");
            tester6.test(20, 100);
            tester6.test(20, 500);
            tester6.test(20, 1000);
            tester6.test(20, 2000);
            tester6.test(20, 5000);
            tester6.test(20, 10000);
            tester6.test(20, 20000);
            tester6.test(20, 75000);
            tester6.test(20, 150000);
*/

            // Close the PrintStream and FileOutputStream when done
            printStream.close();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
