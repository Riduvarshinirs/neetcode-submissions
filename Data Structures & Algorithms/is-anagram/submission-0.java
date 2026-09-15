class Solution {
    public boolean isAnagram(String s, String t) {
        int len1=s.length();
        int len2=t.length();
        if(len1!=len2){
            return false;
        }
        HashMap<Character,Integer> ans=new HashMap<>();
        for(char ch:s.toCharArray()){
            ans.put(ch,ans.getOrDefault(ch,0)+1);
        }
        for(char ch:t.toCharArray()){
            ans.put(ch,ans.getOrDefault(ch,0)-1);
        }
        for(int cnt:ans.values()){
            if(cnt!=0){
                return false;
            }
        }
        return true;
       
    }
}
