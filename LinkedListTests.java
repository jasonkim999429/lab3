import static org.junit.Assert.*;
import org.junit.*;
import java.util.NoSuchElementException;

public class LinkedListTests {
    @Test
    public void testLLConstructor() {
        LinkedList list1 = new LinkedList();
        assertNull(list1.root);
    }

    @Test
    public void testLLPrependEmpty() {
        LinkedList list1 = new LinkedList();
        list1.prepend(0);
        assertEquals(0, list1.root.value);
        assertNull(list1.root.next);
    }

    @Test
    public void testLLPrependNonEmpty() {
        LinkedList list1 = new LinkedList();
        Node node0 = new Node(0, null);
        list1.root = node0;
        list1.prepend(1);
        assertEquals(1, list1.root.value);
        assertEquals(0, list1.root.next.value);
        assertSame(node0, list1.root.next);
        assertNull(list1.root.next.next);
    }

    @Test
    public void testLLAppendEmpty() {
        LinkedList list1 = new LinkedList();
        list1.append(0);
        assertEquals(0, list1.root.value);
        assertNull(list1.root.next);
    }

    @Test
    public void testLLAppendOneElement() {
        LinkedList list1 = new LinkedList();
        Node node0 = new Node(0, null);
        list1.root = node0;
        list1.append(1);
        assertEquals(0, list1.root.value);
        assertEquals(1, list1.root.next.value);
        assertNull(list1.root.next.next);
    }

    @Test
    public void testLLAppendTwoElement() {
        LinkedList list1 = new LinkedList();
        Node node0 = new Node(0, null);
        Node node1 = new Node(1, null);
        list1.root = node0;
        node0.next = node1;
        list1.append(2);
        assertEquals(0, list1.root.value);
        assertEquals(1, list1.root.next.value);
        assertEquals(2, list1.root.next.next.value);
        assertNull(list1.root.next.next.next);
    }

    @Test
    public void testLLFirst() {
        LinkedList list1 = new LinkedList();
        Node node0 = new Node(0, null);
        Node node1 = new Node(1, null);
        list1.root = node0;
        node0.next = node1;
        assertEquals(0, list1.first());
    }

    @Test
    public void testLLLastEmpty() {
        LinkedList list1 = new LinkedList();
        assertThrows(NoSuchElementException.class,
            () -> list1.last());
    }

    @Test
    public void testLLLastOneElement() {
        LinkedList list1 = new LinkedList();
        Node node0 = new Node(0, null);
        list1.root = node0;
        assertEquals(0, list1.last());
    }

    @Test
    public void testLLLastTwoElement() {
        LinkedList list1 = new LinkedList();
        Node node0 = new Node(0, null);
        Node node1 = new Node(1, null);
        list1.root = node0;
        node0.next = node1;
        assertEquals(1, list1.last());
    }

    @Test
    public void testLLToStringEmpty() {
        LinkedList list1 = new LinkedList();
        assertEquals("", list1.toString());
    }

    @Test
    public void testLLToStringOneElement() {
        LinkedList list1 = new LinkedList();
        Node node0 = new Node(0, null);
        list1.root = node0;
        assertEquals("0 ", list1.toString());
    }

    @Test
    public void testLLToStringTwoElement() {
        LinkedList list1 = new LinkedList();
        Node node0 = new Node(0, null);
        Node node1 = new Node(1, null);
        list1.root = node0;
        node0.next = node1;
        assertEquals("0 1 ", list1.toString());
    }

    @Test
    public void testLLLengthEmpty() {
        LinkedList list1 = new LinkedList();
        assertEquals(0, list1.length());
    }

    @Test
    public void testLLLengthOneElement() {
        LinkedList list1 = new LinkedList();
        Node node0 = new Node(0, null);
        list1.root = node0;
        assertEquals(1, list1.length());
    }

    @Test
    public void testLLLengthTwoElement() {
        LinkedList list1 = new LinkedList();
        Node node0 = new Node(0, null);
        Node node1 = new Node(1, null);
        list1.root = node0;
        node0.next = node1;
        assertEquals(2, list1.length());
    }
}
