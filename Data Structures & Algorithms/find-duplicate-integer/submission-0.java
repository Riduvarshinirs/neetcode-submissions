class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> ans= new HashMap<>();
        for(int num:nums){
            ans.put(num,ans.getOrDefault(num,0)+1);
            if(ans.get(num)>1){
                return num;
            }
        }
        return -1;
    }
}
