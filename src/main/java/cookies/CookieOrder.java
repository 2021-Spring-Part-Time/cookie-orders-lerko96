package cookies;

public class CookieOrder {
    //instance variables
    private int numBoxes;
    private String variety;

    //constructor
    public CookieOrder(String variety, int numBoxes){
        this.variety = variety;
        this.numBoxes = numBoxes;
    }

    //accessors
    public String getVariety(){
        return variety;
    }

    public int getNumBoxes(){
        return numBoxes;
    }
}
