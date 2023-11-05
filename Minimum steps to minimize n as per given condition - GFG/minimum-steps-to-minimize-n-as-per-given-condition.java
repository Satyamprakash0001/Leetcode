//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.minSteps(n));
                    
                }
        }
}    
// } Driver Code Ends


class Solution{

	public int minSteps(int N) 
	{ 
	    // Your code goes here
	    int[] dp = new int[N+1];
	    
	    dp[0] = -1;
	    dp[1] = 0;
	    
	    for(int i=2; i<N+1; i++){
	        int res = Integer.MAX_VALUE;
	        if(i%3==0){
	            res = dp[i/3] + 1;
	        }
	        else if(i%2 == 0){
	            res = dp[i/2] + 1;
	        }
	        
	        dp[i] = Math.min(res, dp[i-1] + 1);
	    }
	    
	    return dp[N];
	} 
}
