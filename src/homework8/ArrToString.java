package homework8;

public abstract class ArrToString {
    /// Arrays.toString() metodi format@ harmar cher ogtagorcelu hamar dra hamar sarqeci es metod@
    public static String getToString(Object[] objects) {
        StringBuilder strings = new StringBuilder();
        for (Object obj : objects) {
            strings.append(obj);
        }
        return strings.toString();
    }
}
