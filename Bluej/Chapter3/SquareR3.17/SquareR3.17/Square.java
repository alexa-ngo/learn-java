public class Square {
    private int sideLength;
    private int area;
    private int resultSideLength;
    
    public Square(int initialLength)
    {
        this.sideLength = initialLength;
        this.area = this.sideLength * this.sideLength;
    }
    
    public int getArea() {return this.area;}
    
    public int grow() {
        int resultSideLength = 2 * this.sideLength;
        return resultSideLength;
    }
}