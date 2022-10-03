public class ReplaceTester{
    public static void main(String[] args){
        String stateName = "Mississippi";
        String replace_i_with_bang = stateName.replace("i","!");
        String replace_s_with_dollar_sign = replace_i_with_bang.replace("s","$");
        
        System.out.println("\"Actual\": Mississippi");
        System.out.println("\"Replaces i with !\": " + replace_i_with_bang);
        System.out.println("\"Replaces s with $\": " + replace_s_with_dollar_sign);
    }
}