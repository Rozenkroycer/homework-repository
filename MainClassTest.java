import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass
{

    @Test
    public void testGetLocalNumber(){
        int expected = 14;
        int actual = this.getLocalNumber();
        Assert.assertTrue("Number isn't 14",actual == expected);
    }
}
