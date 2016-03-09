public class Guest {

    private Name name;
    private Gender gender;
    private Age age;
    private Address address;

    public Guest(Name name, Gender gender, Age age, Address address) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }

    public String generateTitle() {
        return gender.equals(Gender.Female) ?
                Gender.Female.getTitle() :
                Gender.Male.getTitle();
    }

    public Name getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }
}