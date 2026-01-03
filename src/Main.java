public class Main {
    public static void main(String[] args) {
        
        // Create a string with leading and trailing whitespace
        String testString = "  This is a test	";

        // Trim the whitespace from both ends of the string
    	String result1 = testString.trim(); // results in “This is a test”

        // Print the original and trimmed strings to the console
        System.out.println("testString : #" + testString + "#");
        System.out.println("testString.trim() : #" +  testString.trim() + "#");

    }
}
