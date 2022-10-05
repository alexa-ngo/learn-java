public class StringFun {
    public static void main(String[] args) {
        String s = "Alexa Ngo";
        /**
         *  A l e x a   N g o
         *  0 1 2 3 4 5 6 7 8
         */
        
        System.out.println(s.charAt(2));
        
        int firstSpaceIndex = s.indexOf(' ');
        
        System.out.println(firstSpaceIndex);
        
        // 0 -> 5
        String firstName = s.substring(0, firstSpaceIndex);
        System.out.println(firstName);
        
        
        String lastName = s.substring(firstSpaceIndex +1);
        System.out.println(lastName);
        
    }
}