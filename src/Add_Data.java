import java.io.*;
import java.util.Scanner;

public class Add_Data extends Product {
    Scanner sc;
    private String item_no;
    private String item_name;
    private String price;

    //Default constructor
    public Add_Data() {

    }

    //Overloading Method
    public Add_Data(Scanner sc) {
        this.sc = sc;
    }

    @Override
    public void setItem_no(String item_no) {
        this.item_no = item_no;
    }

    @Override
    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    @Override
    public void setPrice(String price) {
        this.price = price;
    }

    public void addCoffee(String files) {
        try {
            File file = new File(files);
            FileWriter writer = new FileWriter(file, true);
            writer.write(item_no +","+ item_name +","+ price +"\n");
            writer.close();
            System.out.println("\nEmployee has been Added :)\n");
            System.out.print("\nPress Enter to Continue...");
            sc.nextLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
