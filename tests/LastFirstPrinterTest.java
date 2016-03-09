import org.junit.Assert;
import org.junit.Test;

public class LastFirstPrinterTest {
    @Test
    public void testTostringshouldReturnNameInLastFirstFormatForFemale() throws Exception {
        Name name = new Name("Velma", "Bergstrom");
        LastFirstPrinter label = new LastFirstPrinter("Ms", name);
        Assert.assertEquals("Ms Bergstrom, Velma",label.toString());
    }

    @Test
    public void testTostringshouldReturnNameInLastFirstFormatForMale() throws Exception {
        Name name = new Name("Ashly","Denesik");
        LastFirstPrinter label = new LastFirstPrinter("Mr",name);
        Assert.assertEquals("Mr Denesik, Ashly",label.toString());
    }
}