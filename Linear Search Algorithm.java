/* 
LINEAR SEARCH ALGORITHM
Linear Search is defined as a sequential search algorithm that starts at one end 
and goes through each element of a list until the desired element is found, 
otherwise the search continues till the end of the data set. 

*/

class Main{
    
    //Iterate from 0 to N-1 and compare the value of every index with x if they match return index
    
    static int search(int arr[],int x){
        for(int i=0;i<arr.length;i++)
            if(arr[i]==x)   //If x matches with an element, return the index.
                return i;
            return -1;     //If x doesn’t match with any of the elements, return -1.
    }
    
    public static void main(String[] args)
    {
        int arr[] = {1,4,2,78,43,56,123};
        int x = 43;
        
        int n = search(arr,x);
        if(n==-1)
            System.out.println("Element not Found");
        else
            System.out.println("Element found at index: "+n);
        
        
    }
}