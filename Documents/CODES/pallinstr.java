class Solution {
    public boolean isPalindrome(String str) {
        String s=str.replaceAll("[^a-zA-Z0-9]","");
        s=s.toLowerCase();
        int start=0,end=s.length()-1;
        while(start<=end)
        {
            if(s.charAt(start)!=s.charAt(end))
            {
                return false;
            }
        start++;
        end--;
        }
        return true;
    }
}