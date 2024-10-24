package ex_21092024;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractDateFromString {
    public static void main(String[] args) {
        // Input string
        String str = "adfnskjfdskjfa21dnfsnfkjdbb09sdbfksdfkjcc2024nsdkjfksdj";

        // Regular expression to match the day, month, and year
        Pattern pattern = Pattern.compile("(\\d{2}).*?(\\d{2}).*?(\\d{4})");
        Matcher matcher = pattern.matcher(str);

        // If we find the matching groups, format them into the date
        if (matcher.find()) {
            String day = matcher.group(1);
            String month = matcher.group(2);
            String year = matcher.group(3);

            // Combine the extracted values into the desired date format
            String formattedDate = day + "-" + month + "-" + year;
            System.out.println(formattedDate); // Output: 21-09-2024
        } else {
            System.out.println("No date found in the input string.");
        }
    }
}
