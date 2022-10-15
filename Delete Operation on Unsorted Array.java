/* 
DELETION OPERATION ON AN UNSORTED ARRAY
In the delete operation, the element to be deleted is searched 
using the linear search, and then the delete operation is performed followed by 
shifting the elements. 
*/

class Main{
    // Step 1 - Search Element
    public static int linear_search(int arr[],int n,int x)
    {
        for(int i=0;i<n;i++)
            if(arr[i]==x)
                return i;
        return -1;
    }
    
    public static int delete_ele(int arr[],int n,int x)
    {
        int pos = linear_search(arr,n,x); //position of elemtn to be deleted
        
        if(pos==-1){
            System.out.println("Element not found");
            return n;
        }
            
        for(int i=pos;i<n-1;i++)
            arr[i] = arr[i+1];  // Step 2,3 - Deleting and shifting ELements
            
        return n-1; //new size of the array should be n-1 of the orginal one
    }
    
    public static void main(String[] args)
    {
        int arr[] = {12,34,21,67,32,109};
        int n = arr.length;
        int x = 67;
        
        //Before Deletion 
        System.out.print("Before Deletion: ");
        for(int j=0;j<n;j++)
            System.out.print(arr[j]+" ");
        
        n = delete_ele(arr,n,x);
        
        //After Deletion
        System.out.print("\nAfter Deletion: ");
        for(int j=0;j<n;j++)
            System.out.print(arr[j]+" ");
        
        
    }
}