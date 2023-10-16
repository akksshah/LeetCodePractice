package random;

import org.junit.Test;
import utility.ArrayAsString;

import java.util.HashMap;
import java.util.Map;

public class manan {
    @Test
    public void test() {
//    public static void main(String[] args) {

        String s = "5.0,100,5.5,101,6,102:L10;5.0,99,5.5,100,6,101:L20;";
        String[] row = s.split(";");
        System.out.println(row.length);
        for (String r: row) {
            System.out.println(r);
        }
        Map<String, String> map = new HashMap<>();
        System.out.println(ArrayAsString.stringify(row));
    }

    private void convertToMapEntry(Map<String, String> map, String s) {
        String[] splits = s.split(":");

    }
}
