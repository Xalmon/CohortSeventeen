package work;

public class StringBuilderReverse {
        public static void main(String[] args) {
            String input = "Hello, World!";
            String reversed = reverseString(input);
            System.out.println("Original string: " + input);
            System.out.println("Reversed string: " + reversed);
        }

        public static String reverseString(String input) {
            StringBuilder sb = new StringBuilder(input);
            sb.reverse();
            return sb.toString();
        }
    }


