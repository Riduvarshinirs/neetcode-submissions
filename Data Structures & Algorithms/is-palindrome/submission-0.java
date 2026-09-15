class Solution {
    public boolean isPalindrome(String s) {
        String str=s.replaceAll("[^a-zA-Z0-9]","");
        int st=0;
        int end=str.length()-1;
        while(st<end){
            if(Character.toLowerCase(str.charAt(st))!=Character.toLowerCase(str.charAt(end))){
                return false;
            }
            st++;
            end--;
        }
            return true;

    }
}
