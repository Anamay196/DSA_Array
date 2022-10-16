/* INSERTION OPERATION ON SORTED ARRAY
In a sorted array, a search operation is performed for the possible position of 
the given element by using Binary search, and then an insert operation is 
performed followed by shifting the elements.
*/
class Main{
    public static int insert_ele(int arr[],int n,int x,int size)
    {
        if(n>size)
            return n;
        int i;
        for(i=n-1;(i>=0 && arr[i]>x);i--)
            arr[i+1] = arr[i];
        arr[i+1] = x;
        return n+1;
    }
    
    public static void main(String[] args){
        int size = 25;
        int n = 7;
        int arr[] = new int[size];
        int x = 34;
        arr[0] = 1;
        arr[1] = 12;
        arr[2] = 26;
        arr[3] = 45;
        arr[4] = 56;
        arr[5] = 69;
        arr[6] = 92;
        
        //Before Insertion
        System.out.print("Before Insertion: ");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        
        n = insert_ele(arr,n,x,size);
        //After Insertion
        System.out.print("\nAfter Insertion: ");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}