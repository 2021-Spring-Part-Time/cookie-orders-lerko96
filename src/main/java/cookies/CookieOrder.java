package cookies;

public class CookieOrder {
    //instance variables
    private int numBoxes;
    private String variety;

    //constructor
    public CookieOrder(String localVariety, int localNumBoxes){
        this.variety = localVariety;
        this.numBoxes = localNumBoxes;
    }

    //accessor 1
    public int getNumBoxes(){
        return this.numBoxes;
    }
    //accessor 2
    public String getVariety() {
        return this.variety;
    }
}
