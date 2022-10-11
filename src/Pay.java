import java.util.*;
public class Pay {
    private int amount;
    private int paid;
    int change;
    int  quantity;
    String result = "";
    Scanner sc;

    Pay () {
        System.out.println("Pay.Pay()");
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setPaid(int paid) {
        this.paid = paid;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int calChange() {
        change = paid - amount;
        return change;
    }

    public String calPaid() {
        if(change >= 1000){
            result = ("\n1000 Baht = %d ", change/1000);
            change = change % 1000;
        }
          
        if(change >= 500){
            result = ("\n 500 Baht = %d", change/500);
            change = change % 500;
        }
          
        if(change >= 100){
            result = ("\n 100 Baht = %d", change/100);
            change = change % 100;
        }
          
        if(change >= 50){
            result = ("\n  50 Baht = %d", change/50);
            change = change % 50;
        }
          
        if(change >= 20){
            result = ("\n  20 Baht = %d", change/20);
            change = change % 20;
        }
          
        if(change >= 10){
            result = ("\n  10 Baht = %d", change/10);
            change = change % 10;
        }
          
        if(change >= 5){
            result = ("\n   5 Baht = %d", change/5);
            change = change % 5;
        }
          
        if(change >= 2){
            result = ("\n   2 Baht = %d", change/2);
            change = change % 2;
        }
          
        if(change >= 1){
            result = ("\n   1 Baht = %d", change);
        }
    }




}
