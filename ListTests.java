import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.*;

public class ListTests {

    @Test
    public void testFilter() {
        List<String> list1 = new ArrayList<>();
        StringChecker sc = new StringChecker();
        list1.add(null);
        list1.add("1");
        list1.add("2");
        list1.add("3");
        List<String> list2 = new ArrayList<>();
        list2.add("1");
        list2.add("2");
        list2.add("3");
        assertEquals(list2, ListExamples.filter(list1, sc));
    }
    
    @Test
    public void testMerge() {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list1.add("1");
        list2.add("2");
        list1.add("3");
        list2.add("4");
        List<String> list3 = new ArrayList<>();
        list3.add("1");
        list3.add("2");
        list3.add("3");
        list3.add("4");
        assertEquals(list3, ListExamples.merge(list1, list2));
    }
}
