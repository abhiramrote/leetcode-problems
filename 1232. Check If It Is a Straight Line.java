class Solution {
    public boolean checkStraightLine(int[][] co) {
        

        if(co.length<=2)return true;
        int x1=co[0][0];
        int y1=co[0][1];
        int x2=co[1][0];
        int y2=co[1][1];
        for(int i=2;i<co.length;i++){
            int x=co[i][0];
            int y=co[i][1];
            if((y2-y1)*(x-x1)!=(y-y1)*(x2-x1))return false;

        }
        return true;

    }
}
