public class TrimAndReplace
{
    public static void main(String[] args)
    {
        String stringTrim = "  I need a haircut!   ";
        System.out.println(stringTrim + " I need to find my hair stylist!"); // without trim()
        System.out.println(stringTrim.trim() + " I need to find my hair stylist!"); // with trim()
        System.out.println(stringTrim.replace(" ", "") + " I need to find my hair stylist!"); // removing all spaces from a string with replace()
    }
}