public class SetLimitPeopleTest {
    public static void main(String[] args) {
        
        SetLimitPeople theSetLimitTest = new SetLimitPeople();
        
        System.out.println("The Initial value is " + theSetLimitTest.getValue());
        theSetLimitTest.click();        
        theSetLimitTest.click();
        theSetLimitTest.click();                
        theSetLimitTest.click();
        theSetLimitTest.click();                
        theSetLimitTest.click();
        theSetLimitTest.click();                
        theSetLimitTest.click();
        theSetLimitTest.click();        
        System.out.println("The Initial value is " + theSetLimitTest.getValue());
    }
}