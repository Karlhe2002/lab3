import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.*;

class ShortStringChecker implements StringChecker {
    @Override
    public boolean checkString(String s) {
        return (s.length() < 5);
    }
}

public class ListTests {
 @Test 
 public void shortfilter() {
    ArrayList<String> input23 = new ArrayList<>();
    input23.add("sd");
    input23.add("abf");
    ArrayList<String> answer = new ArrayList<>();
    answer.add("sd");
    answer.add("abf");
    StringChecker sc = new ShortStringChecker();
    assertEquals(true, answer.equals(ListExamples.filter(input23, sc)));
}

}