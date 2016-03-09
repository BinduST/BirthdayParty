import org.junit.Assert;
import org.junit.Test;

public class FirstLastCountryPrinterTest {

    @Test
    public void test_toString_returns_name_in_firstLastCountry_format_if_country_matches() throws Exception {
        Name name = new Name("Gavina", "Hyatt");
        Address address = new Address("Crooks ton", "Illinois", "Romania");
        FirstLastCountryPrinter label = new FirstLastCountryPrinter("Ms", name, address, "Romania");
        Assert.assertEquals("Ms Gavina Hyatt Romania", label.toString());
    }

    @Test
    public void test_toString_returns_null_if_country_doesnot_match() throws Exception {
        Name name = new Name("Gavina", "Hyatt");
        Address address = new Address("Crooks ton", "Illinois", "Romania");
        FirstLastCountryPrinter label = new FirstLastCountryPrinter("Ms", name, address, "Bangladesh");
        Assert.assertEquals("Nobody belongs to this country", label.toString());
    }
}