/* 
Insetion at any position in an unsorted Array

Method 2 - Creating another array and copying the elements till the 
defined position and inserting the element at position and inserting rest of the elements
at right side of the inserted element.
*/
import java.util.*;

class Main{
    
    //function to copy arr1 elements into arr2
    static int insertatpos(int arr1[],int arr2[],int n,int x,int position)
    {
        for(int i=0;i<n+1;i++)
            if(i<position) // till position less then the position of inserting element
                arr2[i] = arr1[i];
            else if(i==position) //inserting element at mentioned position
                arr2[i] = x;
            else    
                arr2[i] = arr1[i-1]; //inserting rest of elements at right side in arr2
        return n+1;
    }
    public static void main(String[] args)
    {
        int n = 5;
        int arr1[] = new int[n];
        int arr2[] = new int[n+1]; //size will be 1+ then the size of arr1
        
        arr1[0] = 12;
        arr1[1] = 23;
        arr1[2] = 34;
        arr1[3] = 46;
        arr1[4] = 92;
        
        int x = 60;
        int position = 3;
        
        //Before Insertion 
        System.out.print("This is arr1: ");
        for(int j=0;j<n;j++)
            System.out.print(arr1[j]+" ");
        
        //calling the ClassNotFoundException
        n=insertatpos(arr1,arr2,n,x,position);
            
        //After insertion 
        System.out.print("\nThis is arr2: ");
        for(int j=0;j<n;j++)
            System.out.print(arr2[j]+" ");
        
        
    }
}