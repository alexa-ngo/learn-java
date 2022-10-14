/** 
 * A class to test the Counter class.
 */
public class CounterTester {
    /**
     * Tests the methods of the Counter class. 
     */
    public static void main(String[] args) {
        Counter tally = new Counter();
        tally.click();
        tally.click();
        tally.click();
        tally.click();
        tally.click();
        tally.click();
        tally.click();
        int result = tally.getValue();
        System.out.println("Expected result is");
        System.out.println(result);
    }
    
}