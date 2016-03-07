
import java.util.Arrays;

public class SortMethods {
    public static void main(String[] args) 	{        
        int[] numbers = new int[] {44, 47, 39, 22, 3, 55, 46, 27, 39, 43, 48, 37, 35, 35, 90, 65, 77, 19, 80, 69, 68, 23, 7, 40, 71};
        long start;
        
        BubbleSort bsort = new BubbleSort(numbers);
        InsertionSort isort = new InsertionSort(numbers);
        HeapSort hsort = new HeapSort(numbers);
        BSTreeSort tsort = new BSTreeSort(numbers);        
        
        start = System.nanoTime();
        System.out.println(Arrays.toString(bsort.Sort()));
        System.out.println("Bubble sort took: " + Long.toString(System.nanoTime()-start) + " nanoseconds.");
        
        start = System.nanoTime();
        System.out.println(Arrays.toString(isort.Sort()));
        System.out.println("Insertion sort took: " + Long.toString(System.nanoTime()-start) + " nanoseconds.");
        
        start = System.nanoTime();
        System.out.println(Arrays.toString(hsort.Sort()));
        System.out.println("Heap sort took: " + Long.toString(System.nanoTime()-start) + " nanoseconds.");
        
        start = System.nanoTime();
        tsort.Sort();
        System.out.print("[");
        tsort.printInOrder(tsort.root);
        System.out.println("]");
        System.out.println("Binary tree sort took: " + Long.toString(System.nanoTime()-start) + " nanoseconds.");
    }
}
