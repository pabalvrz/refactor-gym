package composing.methods;

import java.util.regex.Pattern;

public class SubstituteAlgorithm {
    private static final Pattern IDENTIFIER_PATTERN = Pattern.compile("^[a-zA-Z_][a-zA-Z0-9 ]*$");

    public boolean isValidIdentifier(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        char firstChar = str.charAt(0);
        if (!(Character.isLetter(firstChar) || firstChar == '_')) {
            return false;
        }

        for (int i = 1; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!(Character.isLetterOrDigit(c) || c == ' ')) {
                return false;
            }
        }

        return true;
    }

    public boolean isValidIdentifierArreglado(String str) {
        return str != null && !str.isEmpty() && IDENTIFIER_PATTERN.matcher(str).matches();
    }

}
