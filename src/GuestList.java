import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class GuestList {
    public void printLabel(List<String> options, String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String record;
        while (br.readLine() != null) {
            record = br.readLine();
            Guest newGuest = addGuest(record);
            PrinterList printer = new PrinterList();
            String label = printer.print(options,newGuest);
            System.out.println(label);
        }
    }

    private Guest addGuest(String record) {
        String[] data = record.split(",");
        Name name = new Name(data[0], data[1]);
        Gender gender = Gender.valueOf(data[2]);
        Age age = new Age(Integer.parseInt(data[3]));
        Address address = new Address(data[4], data[5], data[6]);
        return new Guest(name, gender, age, address);
    }
}