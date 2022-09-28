/**
 * Rectangle.java
 * 
 * 2 private members: width, height
 * 
 * 2 getters: getWidth(), getHeight()
 * 2 setters: setWidth(int width), setHeight(int height)
 * 
 * 1 method that computes area: getArea()
 */
public class Rectangle {
    private int _width;
    private int _height;
    
    // Rectangle r = new Rectangle(20, 30);
    // initial width => 20
    // initial height => 30
    public Rectangle(int width, int height) {
        this._width = width;
        this._height = height;
    }
    

    public Rectangle(int length) {
        this._width = length;
        this._height = length; 
    }
    
    public Rectangle () {
        this._width = 0;
        this._height = 0;
    }
    
    public int getWidth() {
        return this._width;
    }
    
    public int getHeight() {
        return this._height;
    }
    
    public void setWidth(int newWidth) {
        this._width = newWidth;
    }
    
    public void setHeight(int newHeight) {
        this._height = newHeight;
    }
    
    public int getArea() {
        int area = this._width * this._height;
        return area;
    }
    
    public void print() {
        System.out.println("Rectangle with (width, height) (" + this.getWidth() + 
            ", " + this.getHeight()  + ") area is " + this.getArea());        
    }
}
