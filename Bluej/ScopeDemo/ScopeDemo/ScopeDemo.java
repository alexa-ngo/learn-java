public class ScopeDemo {
    public String firstName;
    
    public ScopeDemo() {
        this.firstName = "Roger";
    } 
    
    public void printName() {
        String firstName = "Alexa";
        System.out.println(this.firstName); 
        System.out.println(firstName);
    }
}