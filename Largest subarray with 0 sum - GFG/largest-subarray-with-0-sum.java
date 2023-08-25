//{ Driver Code Starts
import java.util.*;

class MaxLenZeroSumSub
{

    // Returns length of the maximum length subarray with 0 sum

    // Drive method
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            GfG g = new GfG();
            System.out.println(g.maxLen(arr, n));
            T--;
        }
    }
}
// } Driver Code Ends


class GfG
{
    // approach
    // idea is to use prefix sum
    // if prefix sum till index i ==k && prefix summ till index j is also k (i<j)
    // then sum between indexes i& j is 0 and length of this subarray is j-i; 
    int maxLen(int arr[], int n)
    {
        // Your code here
        Map<Integer, Integer> hm = new HashMap<>();
        
        int sum = 0;
        int longest = 0;
        
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
            if(sum == 0){
                longest = i+1;
            }
            else if(hm.containsKey(sum)){
                if(i-hm.get(sum)> longest) longest = i-hm.get(sum);
            }
            else{
                hm.put(sum, i);
            }
        }
        
        return longest;
    }
}