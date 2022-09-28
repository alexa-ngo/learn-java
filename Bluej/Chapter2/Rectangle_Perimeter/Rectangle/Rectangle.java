/* Perimeter program:
 * 
 * 1 object: Rectangle
 * 
 * 2 private members: width, height
 * 2 getters: getWidth(), getHeight()
 * 
 * 1 method: getPerimeter()
 * 
 */

public class Rectangle {
    private int _width;
    private int _height;
    
    // Rectangle r = new Rectangle(20,30);
    // inital width => 20
    // initial height => 30
    public Rectangle(int width, int height) {
        this._width = width;
        this._height = height;
    }
    
    public Rectangle() {
        this._width = 0;
        this._height = 0;
    }
    
    public int getWidth() {
        return this._width;
    }
    
    public int getHeight() {
        return this._height;
    }
    
    public int getPerimeter() {
        int perimeter = (2 * this._width) + (2 * this._height);
        return perimeter;
    }
    
    public void print() {
        System.out.println("The perimeter is:" + this.getPerimeter());
    }
}
    