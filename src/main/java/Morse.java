import java.lang.reflect.GenericDeclaration;

public class Morse {
    public static String lookup(char ch) {
        switch (ch) {
            case 'a':
                return ".-";
            case 'b':
                return "-...";
            case 'c':
                return "-.-.";
            case 'd':
                return "-..";
            case 'e':
                return ".";
            case 'f':
                return "..-.";
            case 'g':
                return "--.";
            case 'h':
                return "....";
            case 'i':
                return "..";
            case 'j':
                return ".---";
            case 'k':
                return "-.-";
            case 'l':
                return ".-..";
            case 'm':
                return "--";
            case 'n':
                return "-.";
            case 'o':
                return "---";
            case 'p':
                return ".--.";
            case 'q':
                return "--.-";
            case 'r':
                return ".-.";
            case 's':
                return "...";
            case 't':
                return "-";
            case 'u':
                return "..-";
            case 'v':
                return "...-";
            case 'w':
                return ".--";
            case 'x':
                return "-..-";
            case 'y':
                return "-.--";
            case 'z':
                return "--..";
            case 0:
                return "-----";
            case 1:
                return ".----";
            case 2:
                return "..---";
            case 3:
                return "...--";
            case 4:
                return "....-";
            case 5:
                return ".....";
            case 6:
                return "-....";
            case 7:
                return "--...";
            case 8:
                return "---..";
            case 9:
                return "----.";

        }
        return null;
    }

    public static String encode(String message) {
        String encodedMessage = "";
        boolean isInWord = false;
        int index = 0;
        while (index < message.length()){
            char ch = message.charAt(index);
            String code = lookup(ch);
            if (isInWord) {
                if (code != null) {
                    encodedMessage += "L" + code;
                } else { // Not in word
                    encodedMessage += "W";
                    isInWord = false;
                } else { // Not in word
                    if (code != null) {
                        encodedMessage += code;
                        isInWord = true;
                    }
                }
                index++;
            }
            return null;
        }
    }
}



