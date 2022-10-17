/*
In the delete operation, the element to be deleted is searched using 
binary search, and then the delete operation is performed followed by 
shifting the elements.
*/
class Main{
    
    //binary search function(Recursive approach)
    public static int binary_search(int arr[],int x, int low,int high)
    {
        if(high<low)
            return -1;
        int mid = (low+high)/2;
        if(x==arr[mid])
            return mid;
        else if(x>arr[mid])
            return binary_search(arr,x,mid+1,high);
        return binary_search(arr,x,low,mid-1);
        
    }
    
    public static int delete_ele(int arr[],int n,int x)
    {
        int position = binary_search(arr,x,0,n-1); //return position of element to be deleted
        
        if(position==-1){
            System.out.println("Element not found: ");
            return n;
        }
        for(int i=position;i<n-1;i++) 
            arr[i] = arr[i+1];  //shifting elements
        return n-1;  //new array size should be now n-1
    }
    public static void main(String[]  args){
        int arr[] = {1,12,34,56,76,89,110};
        int n = arr.length;
        int x = 12;
        
        //Before Deletion
        System.out.print("Before Deletion: ");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
            
        n = delete_ele(arr,n,x); //calling the delete function
        
        //After Deletion
        System.out.print("\nAfter Deletion: ");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
            
    }
}