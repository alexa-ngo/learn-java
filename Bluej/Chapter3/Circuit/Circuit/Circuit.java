public class Circuit {
    private int firstSwitchState = 1; 
    private int secondSwitchState = 1;
            
    public int getFirstSwitchState() {
        return firstSwitchState;
    }
    
    public int getSecondSwitchState() {
        return secondSwitchState;
    }    
    
    public int getLampState() {
        if (firstSwitchState == 0 || secondSwitchState == 0) 
            return 1;
        else 
            return 0;
    }
    
}
    

    
