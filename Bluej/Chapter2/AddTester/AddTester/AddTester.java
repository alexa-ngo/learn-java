import java.awt.Rectangle;

/**
 *  A program that prints the expected and actual location, width, and height of box after the call to add.
 */

public class AddTester
{
    public static void main(String[] args)
    {
        Rectangle box = new Rectangle(5, 10, 20, 30);
        
        // Adds a point
        box.add(0,0);
        
        // Print information abou the moved rectangle
        System.out.print("x: ");
        System.out.println(box.getX());
        System.out.println("Expected: 0");
        
        System.out.print("y: ");
        System.out.println(box.getY());
        System.out.println("Expected: 0");
        
        System.out.print("width: ");
        System.out.println(box.getWidth());
        System.out.println("Expected: 25");
        
        System.out.print("height: ");
        System.out.println(box.getHeight());
        System.out.println("Expected: 40");
        
    }
}