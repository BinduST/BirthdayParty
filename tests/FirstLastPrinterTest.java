import org.junit.Assert;
import org.junit.Test;

public class FirstLastPrinterTest {
    @Test
    public void testTostringForMale() throws Exception {
        Name name = new Name("Gavin", "Hyatt");
        FirstLastPrinter label = new FirstLastPrinter("Mr", name);
        Assert.assertEquals("Mr Gavin Hyatt", label.toString());

    }

    @Test
    public void testTostringForFemale() throws Exception {
        Name name = new Name("Julius", "Barrows");
        FirstLastPrinter label = new FirstLastPrinter("Ms", name);
        Assert.assertEquals("Ms Julius Barrows", label.toString());
    }
}