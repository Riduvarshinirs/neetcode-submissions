class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> ans=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            ans.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int needed=target-nums[i];
            if(ans.containsKey(needed) && ans.get(needed)!=i){
                return new int[] {i,ans.get(needed)};
            }
        }
        return new int [] {};
    }
}
