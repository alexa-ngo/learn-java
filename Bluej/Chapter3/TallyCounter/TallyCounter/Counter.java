public class Counter{
    private int value;
    
    public int getValue() {
        return value;
    }
    
    public void click() {
        value = value + 1;
    }
    
    public void reset() {
        value = 0; 
    }
    
    public void undo() { 
        if (Math.max(value, 0) >= 1)
            value = value - 1;
    }
    
}