

public class MainClass {

    private String class_string = "Hello, world!";

    public String getClassString()
    {
        return this.class_string;
    }
    public static boolean containsWords(String inputString, String[] items) {
        boolean found = false;
        for (String item : items) {
            if (inputString.contains(item)) {
                found = true;
                break;
            }
        }
        return found;
    }
}


