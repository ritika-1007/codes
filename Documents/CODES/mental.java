
class Solution {

    public long minTime(long a[], long b[], long n) {
        long s = 0, t = 0;

        // a start
        if (n % 2 == 1) {
            for (int i = 0; i < a.length; i++) {
                if (i % 2 == 0)
                    s += a[i];
                else
                    s += b[i];
            }
        } else {
            for (int i = 0; i < b.length; i++) {
                if (i % 2 == 0)
                    s += a[i];
                else
                    s += b[i];
            }
        }

        // b start
        if (n % 2 == 1) {
            for (int i = 0; i < b.length; i++) {
                if (i % 2 == 0)
                    t += b[i];
                else
                    t += a[i];
            }
        } else {
            for (int i = 0; i < a.length; i++) {
                if (i % 2 == 0)
                    t += b[i];
                else
                    t += a[i];
            }
        }
        long v = Math.min(s, t);
        return v;
    }
}