import java.util.Arrays;

public class ArrayOfString {
    public static void main(String[] args) {
        String[] names = {"Rahul", "Aman", "Priya", "Neha", "Arjun"};

        System.out.println(findName(names, "Priya")); // true
        System.out.println(findName(names, "Ravi"));  // false

        // Modern Twist: Streams
        boolean exists = Arrays.stream(names).anyMatch("Rahul"::equals);
        System.out.println("Exists using stream: " + exists);
    }

    static boolean findName(String[] arr, String name) {
        for (String s : arr) {
            if (s.equals(name)) return true;
        }
        return false;
    }
}
