import java.util.*;
public class Pay {
    private int amount;
    private int paid;
    private int change;

    //Default constructor
    Pay () {
        
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setPaid(int paid) {
        this.paid = paid;
    }

    public int calChange() {
        change = paid - amount;
        return change;
    }
}
