import java.util.*;
import java.io.*;

public class Search_Data {
    Scanner sc;
    private int confirm;
    private int  quantity;
    private int item_no;
    private int prices;

    //Default constructor
    public Search_Data() {

    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setConfirm(int confirm) {
        this.confirm = confirm;
    }

    public int getConfirm() {
        return confirm;
    }

    public int searchData(String file, String searchID) {
        String id = "";
        String name = "";
        String price = "";
        int cancel = 0;
        boolean found = false;

        try {
            sc = new Scanner(new File(file));
            sc.useDelimiter("[,\n]");

            while (sc.hasNext() && !found) {
                id = sc.next();
                name = sc.next();
                price = sc.next();

                if (id.equals(searchID)) {
                    found = true;
                }
            }
            if (found) {
                item_no = Integer.parseInt(id);
                prices = Integer.parseInt(price);
                //System.out.println("ID: "+id+ "\tName: "+ name +"\tPrice: "+ price);
            } else {
                System.out.println("Record not found!");
                cancel = 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cancel;
    }

    public void confirmOrder() {
        System.out.printf("Choice item Espresso    its price is %d\n", prices * quantity);
        System.out.println("\t1. Confirm to buy this");
        System.out.println("\t2. Item List");
        System.out.print("Press 1 to confirm and 2 to back to list : ");
    }
}
