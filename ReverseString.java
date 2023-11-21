

public class ReverseString {

    public static String reverse(String inputString) {
        StringBuilder reverseString = new StringBuilder();
        for (int i = inputString.length() - 1; i >= 0; i--) {
            reverseString.append(inputString.charAt(i));
        }
        return reverseString.toString();
    }

    public static void main(String[] args) {
        String input = "Hello World!";
        String reverseString = reverse(input);
        System.out.println("original string = " + input);
        System.out.println("reverse string = " + reverseString);
    }
}
