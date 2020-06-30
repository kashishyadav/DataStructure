class Solution {


arr[]={1,5,8,4,7,6,5,3,1}
    public void nextPermutation(int[] nums) {
        int i=nums.length-2;
        while(i<=0 && nums[i+1]<nums[i])//traverse from right to find smaller(arr[i]<arr[i+1]......4<7)
            i--;
        if(i>=0)
        {
            int j=nums.length-1;
        while(j<=0 && nums[j]<nums[i])//traverse from right and find less number than arr[i].......3<4
            j--;
            
            swap(nums,i,j);//now swap arr[i] and arr[j]......
        }
        reverse(nums,i+1);//now reverse from index i+1
    }
    public void swap(int nums[],int index1,int index2)
    {
        int temp=arr[index1];
        nums[index1]=nums[index2];
        nums[index2]=temp;
    }
    public void reverse(int nums[],int start)
    {
        int i=start,j=nums.length-1;
        while(i<j)
        {
            swap(nums,i,j);
            i++;
            j--;
        }
    }
}
