/* BINARY SEARCH ALGORITHM (ONLY FOR SORTED ARRAY)
Method 2 Recursive Method
Binary Search is a searching algorithm used in a sorted array by repeatedly 
dividing the search interval in half. 
The idea of binary search is to use the information that the array is sorted 
and reduce the time complexity to O(Log n). 
*/

class Main{
    
    public static int binary_search(int arr[],int low,int high,int x)
    {
        while(low<=high) // repeat search until low=high
        {
            int mid = (low+high)/2;
            if(x==arr[mid])
                return mid; 
            else if(x>arr[mid])
                return binary_search(arr,mid+1,high,x); // recursion call with new low for divided array
            else    
                return binary_search(arr,low,mid-1,x); // recursion call with new high for divided array
        }
        return -1; // if element not found
    }
    public static void main(String[] args)
    {
        int arr[] = {12,34,45,67,89,112,119};
        int x = 34;
        int last = arr.length-1; // last index 
        
        int n = binary_search(arr,0,last,x);
        if(n==-1)
            System.out.println("Element not found");
        else    
            System.out.println("Element found at index: "+n);
        
        
        
    }
}