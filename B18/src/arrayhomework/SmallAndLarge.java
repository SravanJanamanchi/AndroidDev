package arrayhomework;
import java.util.Arrays; 
class SmallAndLarge
{    
    
    public static int kthSmallest(Integer [] arr,  
                                         int k)  
    { 
        
        Arrays.sort(arr); 
  
        return arr[k-1]; 
    }  
      
    // driver program 
    public static void main(String[] args)  
    { 
        Integer arr[] = new Integer[]{1,2, 3,4, 5}; 
        int k = 4; 
        System.out.print( "K'th smallest element is "+ 
                            kthSmallest(arr, k) );      
    } 
}  