import static org.junit.Assert.*;
import org.junit.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileTests {
    @Test
    public void testFileExampleNonDirectory1() throws IOException {
        File start = new File("some-files/a.txt");
        List<File> result = FileExample.getFiles(start);
        List<File> expected = new ArrayList<>();
        expected.add(start);
        assertEquals(expected, result);
    }

    @Test
    public void testFileExampleNonDirectory2() throws IOException {
        File start = new File("some-files/even-more-files/a.txt");
        List<File> result = FileExample.getFiles(start);
        List<File> expected = new ArrayList<>();
        expected.add(start);
        assertEquals(expected, result);
    }

    @Test
    public void testFileExampleMainDirectory() throws IOException {
        File start = new File("some-files");
        List<File> result = FileExample.getFiles(start);
        List<File> expected = new ArrayList<>();
        expected.add(new File("some-files/a.txt"));
        expected.add(new File("some-files/even-more-files/a.txt"));
        expected.add(new File("some-files/even-more-files/d.java"));
        expected.add(new File("some-files/more-files/b.txt"));
        expected.add(new File("some-files/more-files/c.java"));
        assertEquals(expected, result);
    }
}
