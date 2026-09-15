class Solution {
    public int maxArea(int[] heights) {
        int st=0;
        int end=heights.length-1;
        int maxi=0;
        while(st<end){
            int wdth=end-st;
            int ht=Math.min(heights[st],heights[end]);
            int vol=wdth*ht;
            maxi=Math.max(vol,maxi);
            if(heights[st]<heights[end]){
                st++;
            }
            else{end--;}
        }
        return maxi;
    }
}
