//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.longestkSubstr(s, k));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestkSubstr(String s, int k) {
        // code here
        int[] arr = new int[26];
        
        int distinct = 0;
        int max = -1;
        int si = 0;
        for(int i=0; i<s.length(); i++){
            arr[s.charAt(i) - 'a']++;
            if(arr[s.charAt(i) - 'a'] == 1) distinct++;
            if(distinct == k){
                if(i - si + 1 > max) max = i - si + 1;
            }
            else if(distinct > k){
                while(distinct>k){
                    arr[s.charAt(si) - 'a']--;
                    if(arr[s.charAt(si) - 'a'] == 0) distinct--;
                    si++;
                }
            }
        }
        return max;
    }
}