import java.util.*;
import java.io.*;
public class Product {
    private String item_no;
    private String item_name;
    private String price;

    Scanner sc;

    //Default constructor
    public Product() {
        
    }

    //Overloading Method
    public Product(Scanner sc) {
        this.sc = sc;
    }

    public void setItem_no(String item_no) {
        this.item_no = item_no;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getItem_no() {
        return item_no;
    }

    public String getItem_name() {
        return item_name;
    }

    public String getPrice() {
        return price;
    }

    public void printInfo(String file, int admin) {
        //System.out.print("\033[H\033[2J");
        System.out.println("\n=> 0. Main Menu");
        System.out.println("\t ---------------------------------------- ");
        System.out.println("\t |  Item No.  |   Item Name   |  Price  | ");
        System.out.println("\t ---------------------------------------- ");
        try {
            BufferedReader read = new BufferedReader(new FileReader(file));
            String message = "";
            while ((message = read.readLine()) != null) {
                String[] data = message.split(",");
                //System.out.println(Arrays.toString(data));
                System.out.printf("\t\t%s\t%-10s\t%5s\n", data[0], data[1], data[2]);
            }
            read.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("\t ---------------------------------------- ");
        if (admin == 1) {
            System.out.print("\nPress Enter to Continue...");
            sc.nextLine();
        }
    }
}

