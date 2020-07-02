class GfG
{
    int maxLen(int arr[], int n)
    {
        int curr_len=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        int sum=0;
        for(int i=0;i<n;i++)
        {
           sum+=arr[i];
           if(arr[i]==0 && curr_len==0)//initial index
           curr_len=1;
           
           if(sum==0)//chk i+1 index as it is from begining to current index
           curr_len=i+1; //current+1
           
           Integer prev_len=hm.get(sum);//if already present in prefix sum 
                                           //it mean zero as occured
           if(prev_len!=null)
           curr_len=Math.max(i-prev_len,curr_len); //current_index - index where same sum present
           else
           hm.put(sum,i);
            
        }
        return curr_len;
       
       
	   
    }
}
