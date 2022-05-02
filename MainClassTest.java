import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {

    @Test
    public void testGetClassString() {
        String[] expected_words = {"Hello", "hello"};
        String actual = this.getClassString();
        Assert.assertTrue("There is no 'hello' or 'Hello' words", containsWords(actual, expected_words));
    }

}
