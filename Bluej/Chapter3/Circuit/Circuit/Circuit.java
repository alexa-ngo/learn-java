public class Circuit {
    private int firstSwitchState = 0; 
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
    
    public void toggleFirstSwitch() {
        if (firstSwitchState == 1)
            firstSwitchState = 0;
        else
            firstSwitchState = 1;
    }
    
    public void toggleSecondSwitch() {
        if (secondSwitchState == 1)
            secondSwitchState = 0;
        else
            secondSwitchState = 1;
    }
    
    public int alexaGetResult() {
        return secondSwitchState;
    }
}
    

    
