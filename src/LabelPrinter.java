import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LabelPrinter {

    public static void main(String[] args) throws IOException {
        ArgumentSeparator arguments = new ArgumentSeparator(args);
        List<String> options = new ArrayList<String>();
        String file = null;
        if (args.length == 2) {
            options.add(args[0]);
            file = args[1];
        }
        if (args.length > 2) {
            options.add(args[0]);
            options.add(args[1]);
            file = args[2];
        }
        GuestList list = new GuestList();
        list.printLabel(options, file);
    }
}