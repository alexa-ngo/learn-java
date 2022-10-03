public class HollePrinter {
    public static void main(String[] args) {
        String given_string = "Hello World!";
        String replace_e_and_x = given_string.replace("e","x");
        String replace_o_with_y = replace_e_and_x.replace("o","y");
        String replace_x_with_o = replace_o_with_y.replace("x","o");
        String replace_y_with_e = replace_x_with_o.replace("y", "e");
        
        System.out.println("\"Actual\": Hello World");
        System.out.println("\"Replaces e with x\": " + replace_e_and_x);
        System.out.println("\"Replaces o with e\": " + replace_o_with_y);
        System.out.println("\"Replaces x with o\": " + replace_x_with_o);
        System.out.println("\"Replaces y with e\": " + replace_y_with_e);
        
    }
}