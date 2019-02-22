import java.util.Locale;
import java.util.ResourceBundle;

public class Hello {

    public static void main(String[] args) {
        String language = "en";
        String country = "US";

        if (args.length == 1) {
            language = args[0];
        } else if (args.length == 2) {
            language = args[0];
            country = args[1];
        }

        var locale = new Locale(language, country);
        var messages = ResourceBundle.getBundle("messages", locale);

        System.out.print(messages.getString("hello") + " ");
        System.out.println(messages.getString("world"));
    }
}
