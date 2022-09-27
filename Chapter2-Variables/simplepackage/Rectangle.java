package simplepackage;

public class Rectangle {
	private int _width;
	private int _height; 
	
	public Rectangle(int width, int height) {
		this._width = width;
		this._height = height;
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
}