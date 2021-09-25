import org.junit.Assert;
import org.junit.Test;

public class StringExtentionTest {

    @Test
    public void isIP1() {
        Assert.assertTrue(StringExtention.isIP("123.65.34.0"));
    }
    @Test
    public void isIP2() {
        Assert.assertFalse(StringExtention.isIP("123.65.34."));
    }
    @Test
    public void isIP3() {
        Assert.assertFalse(StringExtention.isIP("123.256.34.0"));
    }
    @Test
    public void isIP4() {
        Assert.assertFalse(StringExtention.isIP("123.65.34.0.78"));
    }
    @Test
    public void isGUID1() {
        Assert.assertTrue(StringExtention.isGUID("at34aret-4567-ert5-qwef-123456789qwe"));
    }

    @Test
    public void isGUID2() {
        Assert.assertFalse(StringExtention.isGUID("at34-ret-4567-ert5-qwef-123456789qwe"));
    }

    @Test
    public void isGUID3() {
        Assert.assertFalse(StringExtention.isGUID("at34aret-4567-ert5-qwef-123456789qwey"));
    }

    @Test
    public void isGUID4() {
        Assert.assertFalse(StringExtention.isGUID("at34aret-4567-ert5-qwefu-123456789qwe"));
    }

    @Test
    public void isURL1() {
        Assert.assertTrue(StringExtention.isURL("http://www.example.com"));
    }

    @Test
    public void isURL2() {
        Assert.assertTrue(StringExtention.isURL("http://example.com"));
    }

    @Test
    public void isURL3() {
        Assert.assertFalse(StringExtention.isURL("Just Text"));
    }

    @Test
    public void isURL4() {
        Assert.assertFalse(StringExtention.isURL("http://a.com"));
    }

    @Test
    public void isPassword1() {
        Assert.assertTrue(StringExtention.isPassword("C00l_Pass"));
    }

    @Test
    public void isPassword2() {
        Assert.assertTrue(StringExtention.isPassword("SupperPas1"));
    }

    @Test
    public void isPassword3() {
        Assert.assertFalse(StringExtention.isPassword("Cool_pass"));
    }

    @Test
    public void isPassword4() {
        Assert.assertFalse(StringExtention.isPassword("Cool"));
    }
}