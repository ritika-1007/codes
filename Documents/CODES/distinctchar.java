class Solution {
    public int countGoodSubstrings(String s) {
        int count=0;
        for(int i=0;i<s.length()-2;i++)
        {
            String s1=s.substring(i,i+3);
            char ch1=s1.charAt(0);
            char ch2=s1.charAt(1);
            char ch3=s1.charAt(2);
            if(ch1!=ch2 && ch2!=ch3 && ch3!=ch1)
                count++;
            
        }
        return count;
    }
}