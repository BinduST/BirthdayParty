import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PrinterListTest {
    @Test
    public void test_print_for_f_option() throws Exception {
        PrinterList printerList = new PrinterList();
        List<String> optionList = new ArrayList<>();
        optionList.add("-f");
        Name name = new Name("Madhav", "Menon");
        Gender gender = Gender.Male;
        Age age = new Age(20);
        Address address = new Address("Bangalore", "Karnataka", "India");
        Guest guest = new Guest(name, gender, age, address);
        String label = printerList.print(optionList, guest);
        Assert.assertEquals("Mr Madhav Menon", label);
    }

    @Test
    public void test_print_for_firstLast_option() throws Exception {
        PrinterList printerList = new PrinterList();
        List<String> optionList = new ArrayList<>();
        optionList.add("--firstLast");
        Name name = new Name("Anu", "Menon");
        Gender gender = Gender.Female;
        Age age = new Age(20);
        Address address = new Address("Bangalore", "Karnataka", "India");
        Guest guest = new Guest(name, gender, age, address);
        String label = printerList.print(optionList, guest);
        Assert.assertEquals("Ms Anu Menon", label);
    }

    @Test
    public void test_print_for_l_option() throws Exception {
        PrinterList printerList = new PrinterList();
        List<String> optionList = new ArrayList<>();
        optionList.add("-l");
        Name name = new Name("Anu", "Menon");
        Gender gender = Gender.Female;
        Age age = new Age(20);
        Address address = new Address("Bangalore", "Karnataka", "India");
        Guest guest = new Guest(name, gender, age, address);
        String label = printerList.print(optionList, guest);
        Assert.assertEquals("Ms Menon, Anu", label);
    }

    @Test
    public void test_print_for_lastFirst_option() throws Exception {
        PrinterList printerList = new PrinterList();
        List<String> optionList = new ArrayList<>();
        optionList.add("--lastFirst");
        Name name = new Name("Madhav", "Menon");
        Gender gender = Gender.Male;
        Age age = new Age(20);
        Address address = new Address("Bangalore", "Karnataka", "India");
        Guest guest = new Guest(name, gender, age, address);
        String label = printerList.print(optionList, guest);
        Assert.assertEquals("Mr Menon, Madhav", label);
    }

    @Test
    public void test_print_for_fc_option() throws Exception {
        PrinterList printerList = new PrinterList();
        List<String> optionList = new ArrayList<>();
        optionList.add("-fc");
        optionList.add("India");
        Name name = new Name("Anu", "Menon");
        Gender gender = Gender.Female;
        Age age = new Age(20);
        Address address = new Address("Bangalore", "Karnataka", "India");
        Guest guest = new Guest(name, gender, age, address);
        String label = printerList.print(optionList, guest);
        Assert.assertEquals("Ms Anu Menon India", label);
    }

    @Test
    public void test_print_for_firstLastCountry_option() throws Exception {
        PrinterList printerList = new PrinterList();
        List<String> optionList = new ArrayList<>();
        optionList.add("--firstLastCountry");
        optionList.add("India");
        Name name = new Name("Anu", "Menon");
        Gender gender = Gender.Female;
        Age age = new Age(20);
        Address address = new Address("Bangalore", "Karnataka", "India");
        Guest guest = new Guest(name, gender, age, address);
        String label = printerList.print(optionList, guest);
        Assert.assertEquals("Ms Anu Menon India", label);
    }
}