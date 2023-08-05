class Solution {
    public int maxProfit(int[] a) {
        int maxpro=0;
        int minprice=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            minprice=Math.min(minprice,a[i]);
            maxpro=Math.max(maxpro,a[i]-minprice);
        }
        return maxpro;
    }
}
