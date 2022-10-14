public class CircuitTest {
    public static void main(String[] args) {
        
        Circuit lightSwitchTest = new Circuit();
        /*System.out.println("\n");
        System.out.println("Testing: getFirstSwitchState");
        System.out.println("Expected: 1");
        System.out.println(lightSwitchTest.getFirstSwitchState());
        System.out.println("\n");
        
        System.out.println("Testing: getSecondSwitchState"); 
        System.out.println("Expected: 1");
        System.out.println("Results:" + lightSwitchTest.getSecondSwitchState());
        System.out.println("\n");
        System.out.println("Testing: getLampState");
        System.out.println("Expected: 0");
        System.out.println("Results:" + lightSwitchTest.getLampState());
        System.out.println("\n");
        */
        
        System.out.println("Testing: toggleSecondSwitch");
        lightSwitchTest.toggleSecondSwitch();
        System.out.println("Initial toggleSecondSwitch: 1");
        System.out.println("After toggleSecondSwitch:" + lightSwitchTest.alexaGetResult());
        System.out.println("Expected after toggleSecondSwitch: 0");
        
        
    }
}