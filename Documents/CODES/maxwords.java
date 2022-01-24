class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] str = text.split(" ");
        int count = 0;

        for (String w : str) {
            int broken = 0;
            for (int i = 0; i < brokenLetters.length(); i++) {
                if (w.indexOf(brokenLetters.charAt(i)) > -1) {
                    broken++;
                    break;
                }
            }
            if (broken == 0)
                count++;
        }
        return count;
    }
}
