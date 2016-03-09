public class FirstLastCountryPrinter {
    private Name name;
    private String title;
    private Address address;
    private String searchCountry;

    public FirstLastCountryPrinter(String title, Name name, Address address, String searchCountry) {
        this.title = title;
        this.name = name;
        this.address = address;
        this.searchCountry = searchCountry;
    }

    @Override
    public String toString() {
        String country = address.getCountry();
        if (country.equals(searchCountry))
            return title.concat(" " + name.getFirst() + " " + name.getLast() + " " + country);
        return "Nobody belongs to this country";
    }
}
