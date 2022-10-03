public class ReverseTester {
    public static void main(String[] args) {
        String given_string = "desserts";

        String rev = new StringBuilder(given_string).reverse().toString();
        
        System.out.println("\"Actual\": " + given_string);
        System.out.println("\"Expected\": " + rev);
    }
}