/* Search operation on an Unsorted array

In an unsorted array, the search operation can be performed by linear traversal 
from the first element to the last element. 

*/
import java.util.*;
public class Main
{
    //function that performs search of key element in the array
    static int findelement(int arr[],int n,int key){
        for(int i=0;i<n;i++){
            if(arr[i]==key)
                return i;
        }
        return -1;  // if not found 
        
        
    }
    
    
	public static void main(String[] args) {
		int arr[] = {10,20,32,45};
		int n = arr.length;
		int key = 32;
		
		int position = findelement(arr,n,key);
		
		if(position==-1)
		    System.out.println("Element not found");
		else 
		    System.out.println("Element found at position: "+(position+1));
		
		
		
	}
}
