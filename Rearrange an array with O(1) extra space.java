class Solution
{
 
    // arr: input array
    // n: size of array
    //Function to rearrange an array so that arr[i] becomes arr[arr[i]]
    //with O(1) extra space.
    static void arrange(long arr[], int n)
    {
        // your code here
        sol(arr,0,n);
    }
    static void sol(long arr[],int i,int n){
        if(i==n)return;
        long val=arr[(int)arr[i]];
        sol(arr,i+1,n);
        arr[i]=val;
    }
}
