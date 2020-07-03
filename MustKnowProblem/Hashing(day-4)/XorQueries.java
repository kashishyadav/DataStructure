class Solution {
  
    public int[] xorQueries(int[] arr, int[][] queries) {
        //take all prefic xor of array
        for(int i=1;i<arr.length;i++)
        {
            arr[i]^=arr[i-1];
        }
        int n=queries.length;
        int sum[]=new int[queries.length];
        int q[]=new int[1];
        //if i == 0, query result = A[j] (base condition)
        //if i != 0, query result = A[i - 1] ^ A[j]
        
        for(int i=0;i<n;i++)
        {
            q=queries[i];
            if(q[0]==0)  //it [0,2] is subarray so answer is direct jth index value..
            sum[i]=arr[q[1]];
            else
            sum[i]=arr[q[0]-1]^arr[q[1]];//else minus i-1 to j
        }
        return sum;
    }
}
