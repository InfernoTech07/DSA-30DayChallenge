package solution;
import java.util.*;

class Solution

{
    //Function to find a continuous sub-array which adds up to a given number.
static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
   {
       ArrayList<Integer> a = new ArrayList<Integer>();
       int sum = 0,index=0;
       for(int i =0;i<n;i++){
           sum += arr[i];
           if(sum==s){
               a.add(index+1);
               a.add(i+1);
               return a;
           }
           else if(sum>s){
               i = index;
               sum = 0;
               index++;
           }
       }
       a.add(-1);
       return a;
   }


  
}