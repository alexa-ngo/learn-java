public class RectangleDriver {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(25,40);
        Rectangle s = new Rectangle(25,40);
        // Rectangle t = new Rectangle(50);
    
        Rectangle t = r;
        
        System.out.println(r == s);
        System.out.println(r == t);
        System.out.println(t == s);

    }
}