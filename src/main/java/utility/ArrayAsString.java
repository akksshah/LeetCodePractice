package utility;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayAsString {


    public static String stringify(int[] array) {
        return array == null ? "" : Arrays.stream(array).mapToObj(i -> i + ",").collect(Collectors.joining("", "[", "]"));
    }
    public static String stringify(String[] array) {
        return array == null ? "" : String.join(",", array);
    }
}
