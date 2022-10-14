public class SetLimitPeople
{
    private int value;
    private int limit;
    public void setLimit(int maximum){
        limit = maximum;
        System.out.println(limit);
    }
    
    public int getValue() {
        return value;
    }
    
    public void click() {
        int n = 10;
        this.limit = 5;
        if (value < (Math.min(n, this.limit)))
            value = value + 1;
    }
        
}