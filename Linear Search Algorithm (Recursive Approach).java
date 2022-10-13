// LINEAR SEARCH ALGORITHM (RECURSIVE APPROACH)

class Main{
    
    static int linearsearch(int arr[],int size,int x)
    {
        if(size==0)  //If the size of the array is zero then, return -1
            return -1;
        else if(arr[size-1]==x)  //If equal, then return the index of the found key
            return size-1;
        else
            return linearsearch(arr,size-1,x); //recursion call
    }
    
    public static void main(String[] args){
        int arr[] = {12,34,21,78,54,89,43};
        int x = 78;
        
        int index = linearsearch(arr,arr.length,x);
        
        if(index==-1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index: "+index);
    }
}