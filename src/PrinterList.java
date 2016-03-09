import java.util.List;

public class PrinterList {

    public String print(List<String> options, Guest newGuest) {
        String title = newGuest.generateTitle();
        switch (options.get(0)) {
            case "-f":
            case "--firstLast":
                return String.valueOf(new FirstLastPrinter(title, newGuest.getName()));
            case "-l":
            case "--lastFirst":
                return String.valueOf(new LastFirstPrinter(title, newGuest.getName()));
            case "-fc":
            case "--firstLastCountry":
                String countryNeed = options.get(1);
                return new FirstLastCountryPrinter(title, newGuest.getName(), newGuest.getAddress(), countryNeed).toString();
            case "-lc":
            case "--lastFirstCountry":
                countryNeed = options.get(1);
                return new LastFirstCountryPrinter(title, newGuest.getName(), newGuest.getAddress(), countryNeed).toString();
            default:
                return "Invalid option";
        }
    }
}
