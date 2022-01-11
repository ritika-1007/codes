class nextgrechar {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0, end = letters.length - 1;
        int mid = 0;
        char res = '#';
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (letters[mid] > target) {
                res = letters[mid];
                end = mid - 1;
            } else
                start = mid + 1;

        }
        if (res == '#')
            return letters[0];
        return res;
    }
}
