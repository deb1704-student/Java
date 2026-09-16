public class StringBasics {
    public static void main(String[] args) {
        String s = "Java Programming";

        // Length
        System.out.println("Length: " + s.length());

        // Character at an index
        System.out.println("Character at index 2: " + s.charAt(2));

        // Substring: begin inclusive, end exclusive
        System.out.println("Substring: " + s.substring(0, 4));

        // Search
        System.out.println("Contains Java: " + s.contains("Java"));
        System.out.println("Index of Programming: " + s.indexOf("Programming"));

        // Case conversion
        System.out.println("Uppercase: " + s.toUpperCase());
        System.out.println("Lowercase: " + s.toLowerCase());

        // Equality: compare content, not references
        String a = "Java";
        String b = new String("Java");
        System.out.println("Content equal: " + a.equals(b));
        System.out.println("Case-insensitive equal: " + a.equalsIgnoreCase("JAVA"));
    }
}
