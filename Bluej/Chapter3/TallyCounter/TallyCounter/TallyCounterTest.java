public class TallyCounterTest {
    public static void main(String[] args) {
        
        Counter theTallyCounter = new Counter();
        
        theTallyCounter.click();
        theTallyCounter.click();
        theTallyCounter.click();
        theTallyCounter.click();
        theTallyCounter.click();
        theTallyCounter.click();
        theTallyCounter.click();
        theTallyCounter.click();
        theTallyCounter.click();
        theTallyCounter.click();
        theTallyCounter.click();
        System.out.println("Initial value is 11");
        System.out.println("The Initial value is " + theTallyCounter.getValue());
        System.out.println("\n");
        theTallyCounter.undo();
        theTallyCounter.undo();
        theTallyCounter.undo();
        theTallyCounter.undo();
        theTallyCounter.undo();
        System.out.println("The Final value is " + theTallyCounter.getValue());
        System.out.println("Expected after theTallyCounter.undo: 5");
        System.out.println("\n");        
        theTallyCounter.undo();
        theTallyCounter.undo();
        theTallyCounter.undo();
        theTallyCounter.undo();
        theTallyCounter.undo();
        theTallyCounter.undo();
        theTallyCounter.undo();
        theTallyCounter.undo();
        theTallyCounter.undo();
        theTallyCounter.undo();
        System.out.println("Now the the Final value should be 0: " + theTallyCounter.getValue());    

    }
}