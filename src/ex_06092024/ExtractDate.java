package ex_06092024;

public class ExtractDate {
    public static void main(String[] args) {
        String input = "fgfgghf2022-fgj10ghd-01jdjk";
        StringBuilder result = new StringBuilder();

        // Counter to track how many parts of the date (year, month, day) we have found
        int partsFound = 0;
        StringBuilder temp = new StringBuilder();

        // Iterate through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character is a digit
            if (Character.isDigit(ch)) {
                temp.append(ch);  // Collect the digit
            } else if (temp.length() > 0) {
                // If we hit a non-digit after collecting some digits, it means a date part is complete
                result.append(temp);
                partsFound++;

                // Add a dash between date parts (year-month-day)
                if (partsFound < 3) {
                    result.append("-");
                }

                temp.setLength(0);  // Reset the temp to collect the next part

                // Stop when we have found the year, month, and day (3 parts)
                if (partsFound == 3) {
                    break;
                }
            }
        }

        // Output the extracted date
        System.out.println(result.toString());
    }
}
