public class Square {
    private int sideLength;
    private int area;

    public Square(int length)
    {
        this.sideLength = length;
    }
    
    public int getArea()
    {
        return this.area = this.sideLength * this.sideLength;
    }
}