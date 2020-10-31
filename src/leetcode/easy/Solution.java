package leetcode.easy;

public class Solution {
    public static void main(String[] args) {
        switch (args[1]) {
            case "RemoveDuplicates":
            case "LeetCode26":
            case "LC26":
                System.out.println("Returned length of the new Array: "
                                       + new RemoveDuplicates().removeDuplicates(new int[]{}));
                break;

                case "RemoveElement":
            case "LeetCode27":
            case "LC27":
                System.out.println("Returned length of the new Array: "
                                       + new RemoveElement().removeElement(new int[]{}, 0));
                break;

            case "strStr":
            case "LeetCode28":
            case "LC28":
                System.out.println("Index of needle in haystack: "
                                       + new StrStr().strStr("", ""));
                break;

            case "SearchInsertPosition":
            case "LeetCode35":
            case "LC35":
                System.out.println("Index found or where it can be inserted: "
                                       + new SearchInsert().searchInsert(new int[]{}, 0));
                break;
        }
    }
}
