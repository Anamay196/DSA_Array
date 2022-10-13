/* Insertion operation on an unsorted array

In an unsorted array, the insert operation is faster as compared to a sorted array 
because we don’t have to care about the position at which the element is to be placed.
*/

import java.util.*;

class Main {
    
    static int insertelement(int arr[] , int n,int key,int capacity)
    {
        //Cannot insert more elements if n
        // is already more than or equal to
        // capacity
        if(n>=capacity) 
            return n; // returns n if insertion not successful
        arr[n] = key;
        
        return(n+1); // the new used size will be n+1 after insertion
    }
    
    public static void main(String[] args)
    {
        int capacity = 20;
        int arr[] = new int[capacity];
        int key = 23;
        int n = 5;
        arr[0] = 12;
        arr[1] = 26;
        arr[2] = 54;
        arr[3] = 32;
        arr[4] = 45;
        
        //before insertion the original array
        System.out.print("Before insetion: ");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        
        
        //calling the insertion function
        n = insertelement(arr,n,key,capacity);
        
        //after insertion the final array 
        System.out.print("\nAfter insertion: ");
        for(int j=0;j<n;j++)
            System.out.print(arr[j]+" ");
        
        
    }
}
  
