import java.awt.Rectangle;

public class PerimeterTester{
    public static void main(String[] args) {
        Rectangle box = new Rectangle(5, 10, 20, 30);
        
        double width = box.getWidth();
        double height = box.getHeight();
        double perimeter = 2 * box.getWidth() + 2 * box.getHeight();
        
        System.out.println("The width: " + width);
        System.out.println("The height: " + height);
        System.out.println("The perimeter of the Rectangle object: " 
        + perimeter);
    }
}