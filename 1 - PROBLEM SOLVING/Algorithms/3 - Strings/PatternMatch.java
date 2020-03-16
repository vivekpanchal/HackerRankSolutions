/**
 * If you ar given two strings: one called BIG and one called SMALL
 * If the SMALL string is contained in the BIG string -> print where it begins in the BIG string
 * <p>
 * <p>
 * the easy algorithm is O(n * k)
 * but KMP search is O(n + k)
 */
public class PatternMatch {

    //    this complexity is O(n * k)
    public static int plebMethod(String big, String small) {
        if (big.length() == 0 || small.length() == 0 || small.length() > big.length())
            return -1;

        int count = 0;
        int pos = -1;

        for (int i = 0; i < big.length(); i++) {
            if (big.charAt(i) == small.charAt(count)) {
                if (count == 0) {
                    pos = i;
                }
                count += 1;
                if (count == small.length()) {
                    return pos;
                }
            } else {
                i = pos;
                pos = -1;
                count = 0;
            }
        }
        if (count < small.length()) {
            return -1;
        } else {
            return pos;
        }
    }

    //    this complexity should be O(n + m)
    public static int kmpMethod(String big, String small) {

        int pos = -1;
        int[] suffixPositions = getSuffixArray(small);
        int count = 0;
        int i = 0;
        while (i < big.length()) {
            if (big.charAt(i) == small.charAt(count)) {
                count++;
                if (count == small.length()) {
                    return i - small.length();
                }
            } else {
                if (count > 0) {
                    count = suffixPositions[count - 1];
                    continue;
                }
            }
            i++;
        }
        return -1;
    }


    /**
     *
     * we can create an array of 'partial matches and where they begin'
     * this is useful so we don't always scan from the beginning of the SMALL string
     */
    //constructing this should take O(k) where k is the size of small
    public static int[] getSuffixArray(String small) {
        int[] suffixPositions = new int[small.length()];

        int trailing = 0;
        int i = 1;
        while (i < small.length()) {

            //there is a prefix of length 'trailing' that is the same as the current suffix
            if (small.charAt(i) == small.charAt(trailing)) {
                suffixPositions[i] = trailing + 1;
                trailing += 1;
                i++;
                continue;
            }
            // start scanning from the beginning - suffix does not match any prefix
            if (small.charAt(i) != small.charAt(trailing) && trailing == 0) {
                suffixPositions[i] = 0;
            } else {
//                if small.charAt(i) != small.charAt(trailing) && trailing > 0
                trailing = suffixPositions[trailing - 1];
                continue;
            }
            i++;
        }
        return suffixPositions;
    }

    public static void main(String[] args) {

        //the small string is contained in the big one
        String big = "abxabcabcaby";
        String small = "abcaby";


        System.out.println(kmpMethod(big, small));
    }
}