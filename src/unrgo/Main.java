package unrgo;

public class Main {

    public static void main(String[] args) {
        SelectionSort ob = new SelectionSort();
        int []arr = {123,23,142,54,19};
        ob.sort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}
