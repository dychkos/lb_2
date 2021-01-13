package unrgo;

// Реалізація сортуванння вставкою
class SelectionSort
{
    void sort(int arr[])
    {
        int n = arr.length;


        for (int i = 0; i < n-1; i++)
        {
            // пошук найменшого елемента масиву
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            //переміщуем найменший елемент в початок

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    // показ массиву
    void printArray(int []arr)
    {
        int n = arr.length;
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }



}

