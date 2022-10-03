import java.awt.Color;

public class Pixel {
    private Color _color;
    
    public Pixel() {
        this._color = new Color(0,0,0);
    }
    
    public Pixel(int red, int green, int blue) {
        this._color = new Color(red, green, blue);
    }
    
    public int getRed() {
        return this._color.getRed();    // wrapping the getRed()
    }
    
    private Pixel(int green, int blue) {
        this._color = new Color(255, green, blue);
    }
    
    public static Pixel getVeryRedPixel(int green, int blue) {
        return new Pixel(green, blue);   
    }    
    
    public int getGreen() {
        return this._color.getGreen();
    }
    
    public int getBlue() {
        return this._color.getBlue();
    }
    
    public void brighten(int delta) {
        int tempRed = this._color.getRed();
        int tempGreen = this._color.getGreen();
        int tempBlue = this._color.getBlue();
        
        tempRed += delta;
        tempGreen += delta;
        tempBlue += delta;
        
        Color newColor = new Color(tempRed, tempGreen, tempBlue);
        
        this._color = newColor;
    }
    
    
    private void darken(int delta) {
        int tempRed = this._color.getRed();
        int tempGreen = this._color.getGreen();
        int tempBlue = this._color.getBlue();
        
        tempRed -= delta;
        tempGreen -= delta;
        tempBlue -= delta;
        
        Color newColor = new Color(tempRed, tempGreen, tempBlue);
        
        this._color = newColor;
    }
    
    
    public String toJSON() {
        String jsonResult = 
            "{" +
                "\"r\":" + this.getRed() + "," +
                "\"g\":" + this.getGreen() + "," +
                "\"b\":" + this.getBlue() +
            "}";
        return jsonResult;
    }
    
    public void print() {
        System.out.println("(" + this.getRed() + ", " +this.getGreen() + ", " 
            + this.getBlue() + ")");
    }
}