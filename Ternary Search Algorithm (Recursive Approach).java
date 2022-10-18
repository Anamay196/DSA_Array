/* 
TERNARY SEARCH  (Recursive Approach)
We divide the given array into three parts and determine which has the
key (searched element). We can divide the array into three parts by taking mid1 and mid2
Initially, l and r will be equal to 0 and n-1 respectively, where n is the length of the array. 
*/

class Main{
    
    // ternary search function
    public static int ternary_search(int arr[],int l,int r,int x)
    {
        while(r>=1){
            int mid1 = l+(r-l)/3;
            int mid2 = r - (r-l)/3;
            if(x==arr[mid1]){ // 1.compare the key with the element at mid1. If found equal, we return mid1.
                return mid1;
            }
            if(x==arr[mid2]){ // 2.If not, then we compare the key with the element at mid2. If found equal, we return mid2.
                return mid2;
            }
            if(x<arr[mid1]){ // 3. If not, then we check whether the key is less than the element at mid1. If yes, then recur to the first part.
                return ternary_search(arr,l,mid1-1,x); // recursion call with new last index
            }
            if(x>arr[mid2]){ // 4.If not, then we check whether the key is greater than the element at mid2. If yes, then recur to the third part.
                return ternary_search(arr,mid2+1,r,x); // recursion call with new first index
            }
            else            // 5.If not, then we recur to the second (middle) part.
                return ternary_search(arr,mid1+1,mid2-1,x);
        }
        return -1; // if element not found 
    }
    public static void main(String[] args)
    {
        int arr[] = {12,25,31,49,54,60,84,97,110};
        int n = arr.length;
        int x = 97;
        int l = 0;
        int r = n-1;
        
        
        int index = ternary_search(arr,l,r,x);
        
        if(index==-1)
            System.out.print("Element not found");
        else
            System.out.print("Element found at index: "+index);
        
        
        
    }
}