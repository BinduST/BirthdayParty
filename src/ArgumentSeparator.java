import java.util.ArrayList;
import java.util.List;

public class ArgumentSeparator {
    public ArgumentSeparator(String[] args) {
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
    }
}
