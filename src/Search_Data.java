import java.util.*;
import java.io.*;

public class Search_Data {
    Scanner sc;
    private int confirm;
    String string_price = "";
    String name = "";

    //Default constructor
    public Search_Data() {

    }

    public void setConfirm(int confirm) {
        this.confirm = confirm;
    }

    public int getConfirm() {
        return confirm;
    }

    public int searchData(String file, String searchID) {
        String id = "";  
        int cancel = 0;
        boolean found = false;

        try {
            sc = new Scanner(new File(file));
            sc.useDelimiter("[,\n]");

            while (sc.hasNext() && !found) {
                id = sc.next();
                name = sc.next();
                string_price = sc.next();

                if (id.equals(searchID)) {
                    found = true;
                }
            }
            if (found) {
                //System.out.println("ID: "+id+ "\tName: "+ name +"\tPrice: "+ string_price);
            } else {
                System.out.println("Record not found!");
                cancel = 1;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cancel;
    }

    public void confirmOrder() {
        //String parse_price = new String(string_price).toString();
        //price = Integer.parseInt(parse_price);
        System.out.printf("\tChoice item %s its price is %s\n", name, string_price);
        System.out.println("\t\t1. Confirm to buy this");
        System.out.println("\t\t2. Item List");
        System.out.print("\tPress 1 to confirm and 2 to back to list : ");
    }
}
