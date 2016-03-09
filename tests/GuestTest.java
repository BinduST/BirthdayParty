import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    @Test
    public void testGenerateTitleReturnMrForMale() throws Exception {
        Name name = new Name("Madhav", "Menon");
        Gender gender = Gender.Male;
        Age age = new Age(20);
        Address address = new Address("Bangalore", "Karnataka", "India");
        Guest maleGuest = new Guest(name, gender, age, address);
        String title = maleGuest.generateTitle();
        assertEquals("Mr", title);
    }

    @Test
    public void testGenerateTitleReturnMrForFemale() throws Exception {
        Name name = new Name("Julius", "Barrows");
        Gender gender = Gender.Female;
        Age age = new Age(25);
        Address address = new Address("Veda haven","Vermont","Macedonia");
        Guest femaleGuest = new Guest(name, gender, age, address);
        String title = femaleGuest.generateTitle();
        assertEquals("Ms", title);
    }
}