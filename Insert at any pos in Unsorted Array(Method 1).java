/* 
Insert at any position in an unsorted array

Method 1 - Insert operation in an array at any position can be performed by shifting elements to the right, 
which are on the right side of the required position
*/
import java.util.*;

class Main{
    
    //function to insert x at position in arr
    static int insertatpos(int arr[],int n,int x,int position)
    {   
        //shift elements to the right side of position
        for(int i=n-1;i>=position;i--)
            arr[i+1] = arr[i];
        arr[position] = x;
    return n+1; // new array size will be n+1 
    }
    
    public static void main(String[] args)
    {
        
        int arr[] = new int[15];
        int x = 52;
        int n = 5;
        int position = 3;
        
        arr[0] = 12;
        arr[1] = 23;
        arr[2] = 34;
        arr[3] = 56;
        arr[4] = 07;
        
        //before insertion 
        System.out.print("Before Insertion: ");
        for(int j=0;j<n;j++)
            System.out.print(arr[j]+" ");
        
        //calling fucntion
        n = insertatpos(arr,n,x,position);
        
        //after insertion
        System.out.print("\nAfter Insertion: ");
        for(int k=0;k<n;k++)
            System.out.print(arr[k]+" ");
        
    }
}