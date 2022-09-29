public class MississippiReplace
{
    public static void main(String[] args)
    {
        String stateName = "Mississippi";
        String replace_i_with_ii = stateName.replace("i","ii");
        String replace_ss_with_s = replace_i_with_ii.replace("ss","s");
        
        System.out.println("\"Replaces i with ii\": " + replace_i_with_ii);
        System.out.println("\"Replaces ss with s\": " + replace_ss_with_s);
    }
}