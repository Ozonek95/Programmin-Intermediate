package dnaexercise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputValidator {

    public boolean checkIfItsValidInput(String input) {
        Pattern pattern = Pattern.compile("[ACGUT]+");
        Matcher matcher = pattern.matcher(input);
        if (input.length() % 3 == 0) {
            if (matcher.matches()) {
                return true;
            }
        }
        return false;
    }

    public boolean checkIfItsRNA(String input) {
        return input.contains("U");
    }
}
