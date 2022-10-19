/*
SELECTION SORT ALGORITHM

The selection sort algorithm sorts an array by repeatedly finding the minimum 
element (considering ascending order) from the unsorted part and putting it at the beginning. 

*Note - The default implementation is not stable. However, it can be made stable.
A sorting algorithm is said to be stable if two objects with equal or same keys appear in the same order 
in sorted output as they appear in the input array to be sorted.
Please see stable selection sort for stable sorting.

*/
class Main{
    public static void selection_sort(int[] arr,int n) 
    {
        int i;
        int smallest_index = 0;
        //5 . Repeat until the array is sorted.
        for (i = 0; i < n - 1; i++)
        { 
            // 4. Then, increment smallest_index to point to the next element
            smallest_index = i;  //1 . Initialize minimum value(smallest_index) to location 0.
            
        // 2. Traverse the array to find the minimum element in the array.    
        for (int j = i + 1; j < n; j++) {
            if (arr[smallest_index] > arr[j])  // 3. While traversing if any element smaller than smallest_index is found then 
                smallest_index = j;
        }
        int temp = arr[smallest_index]; // 3 . swap both the values.
        arr[smallest_index] = arr[i];
        arr[i] = temp;
        }
    }

    public static void main(String[] args)
    {
        int[] arr = {1,54,67,23,5,25};
        int n = arr.length;

        selection_sort(arr,n); // calling function

        for (int i : arr) System.out.print(i + " "); // for-each loop

    }
}