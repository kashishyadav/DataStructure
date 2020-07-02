class Solution {
    public int[] twoSum(int[] arr, int target) {
         int index1=0,index2=0;
     
        int i=0,j=arr.length-1;
       
        int temp[]=new int[arr.length];
        for(int k=0;k<arr.length;k++)
        {
            temp[k]=arr[k];
        }
        Arrays.sort(arr);
        int sum=0;
        while(i<j)
        {
            sum=(arr[i]+arr[j]);
            if(sum==target)
            {
                index1=i;
                index2=j;
                break;
            }
            if(sum>target)
            {
                
            j--;
                continue;
             }
               i++;
        }
        int c1=0,c2=0;
        for( i=0;i<arr.length;i++)
        {
            if(arr[index1]==temp[i] && c1==0)
            {
                index1=i;
                c1++;
            }
            else if(arr[index2]==temp[i] && c2==0)
            {
                index2=i;
                c2++;
            } 
            if(c1==1 && c2==1)
                break;
        }
        int arr1[]=new int[2];
        arr1[0]=index1+1;
        arr1[1]=index2+1;
        return arr1;
    }
}
