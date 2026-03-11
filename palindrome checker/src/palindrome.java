public class palindrome{
    static void main() {
                String original = "radar";

                // Reverse the string
                String reversed = new StringBuilder(original).reverse().toString();

                // Check if original equals reversed
                if (original.equals(reversed)) {
                    System.out.println(original + " is a palindrome.");
                } else {
                    System.out.println(original + " is not a palindrome.");
                }
            }
        }


