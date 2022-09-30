// Construct a Rectangle object and computes and prints its area

import java.awt.Rectangle;

public class AreaTester 
{
    public static void main(String[] args) 
    {
        // Create Rectangle box
        Rectangle box = new Rectangle(5, 10, 20, 30);
        
        double width = box.getWidth();
        double height = box.getHeight();
        double area = box.getWidth() * box.getHeight();
        
        System.out.println("The width: " + width);
        System.out.println("The height: " + height);
        System.out.println("The area of the Rectangle object: " + area);
    }
}
