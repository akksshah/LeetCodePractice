package easy;

public class StrStr {
    public int strStr(String haystack, String needle) {
        if (needle == null || needle.length() == 0) {
            return 0;
        }
        if (haystack == null) {
            return -1;
        }
        return haystack.indexOf(needle);
    }
}
