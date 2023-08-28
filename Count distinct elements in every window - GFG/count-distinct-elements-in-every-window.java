//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.util.HashMap;

class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) 
                a[i] = sc.nextInt();
            Solution g = new Solution();
            
            ArrayList<Integer> ans = g.countDistinct(a, n, k);

            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
            t--;
        }
    }
}
// } Driver Code Ends


class Solution
{
    ArrayList<Integer> countDistinct(int A[], int n, int k)
    {
        // code here 
        ArrayList<Integer> li = new ArrayList<>();
        
        Map<Integer, Integer> hm = new HashMap<>();
        int i=0, j= i+k-1;
        for(int x=i; x<=j; x++){
            hm.put(A[x], x);
        }
        li.add(hm.size());
        
        j++;
        while(j<A.length){
            hm.remove(A[i], i);
            i++;
            hm.put(A[j], j);
            li.add(hm.size());
            j++;
        }
        
        return li;
    }
}

