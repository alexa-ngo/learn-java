public class RangeInput {
    int min = 60; 
    int max = 80;
    int value = 70;

    //Stops when min is reached
    public void down() {
        if(Math.max(min, max) > value && value > (Math.min(min, max))) 
            value = value - 1;
    }
    
    //Stops when max is reached
    public void up() {
        if(Math.min(min, max) < value && value < (Math.max(min, max)))
            value = value + 1; 
    }

    public int getValue() {
        return value; 
    }
}

    