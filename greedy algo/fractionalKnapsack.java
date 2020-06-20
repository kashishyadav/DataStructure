class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}
class sortbyvalue implements Comparator<Item>
{
    public int compare(Item i1,Item i2)
    {
        double cost1=(i1.value)/(i1.weight*1.0);
        double cost2=(i2.value)/(i2.weight*1.0);
        if(cost1<cost2)
        return 1;
        return -1;
    }
}
class solve{
    double fractionalKnapsack(int W, Item arr[], int n) {
        // Your code here
        Arrays.sort(arr,new sortbyvalue());
        double profit=0;
        for(int i=0;i<n;i++)
        {
            // System.out.println("arr[i] "+arr[i].weight+" w: "+W);
            int h=W-arr[i].weight;
           // System.out.println("h: "+h);
            if(h>0)
            {
                W=W-arr[i].weight;
               // System.out.println("pr before: "+profit+" w: "+W+"   arrval: "+arr[i].value);
                profit+=arr[i].value;
               // System.out.println("pr after: "+profit+" w: "+W);
            }
            else
            {
               // System.out.println("pr1 before: "+profit+" w: "+W+"   arrval: "+arr[i].value);
                double ans=(arr[i].value)/(arr[i].weight*1.0);
               // System.out.println("ans "+ans);
                profit+=(W*ans);
               //  System.out.println("pr1: "+profit);
                break;
            }
        }
        return profit;
    }
}
