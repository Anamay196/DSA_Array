/*
BUBBLE SORT 
--------------
Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the 
adjacent elements if they are in the wrong order. 

This algorithm is not suitable for large data sets as its average and worst-case 
time complexity is quite high.
*/

public class Main
{
    public static void bubble_sort(int[] arr,int n)
    {
        // Run a nested for loop to traverse the input array using two variables i and j, such that 0 ≤ i < n-1 and 0 ≤ j < n-i-1
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){ // If arr[j] is greater than arr[j+1] then swap these adjacent elements
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp; 
                }
            }
        }
    }
	public static void main(String[] args) {
		int[] arr  = {98,78,105,65,32,61,12};
		int n = arr.length;
		
		bubble_sort(arr,n);
		
		// Print the sorted array
		for(int i:arr) System.out.print(i+" ");
	}
}
