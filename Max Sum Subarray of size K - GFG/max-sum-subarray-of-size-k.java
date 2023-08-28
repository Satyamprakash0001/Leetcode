//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            
            int N=sc.nextInt();
            int K=sc.nextInt();
            ArrayList<Integer> Arr = new ArrayList<Integer>(N); 
  
            // Appending new elements at 
            // the end of the list 
            for (int i = 0; i < N; i++) {
                int x = sc.nextInt();
                Arr.add(x); 
            }

            Solution ob = new Solution();
            System.out.println(ob.maximumSumSubarray(K,Arr,N));
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        // code here
        if(K>N) return 0;
        int i=0, j=i+K-1;
        long longest = 0;
        long sum = 0;
        for(int x=i; x<=j; x++){
            sum += Arr.get(x);    
        }
        
        longest = sum;
        j++;
        while(j<N){
            long curr = sum-Arr.get(i)+Arr.get(j);
            if(curr>longest) longest = curr;
            sum = curr;
            i++;
            j++;
        }
        
        return longest;
    }
}