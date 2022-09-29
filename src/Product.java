import java.util.*;
import java.io.*;

public class Product {
    String item_no;
    String item_name;
    String price;
    int order;
    Scanner sc;

    public Product(Scanner rk) {
        sc = rk;
    }
    public void getInfo() {
        System.out.print("Enter Item No. >>> ");
        item_no = sc.next();
        System.out.print("Enter Name >>> ");
        item_name = sc.next();
        System.out.print("Enter Price >>> ");
        price = sc.next();
    }
    /*public void addData() {
        try {
            File file = new File("Data Stock.txt");
            if (file.createNewFile()) {
                FileWriter writer = new FileWriter("Data Stock.txt");
                writer.write(item_no +","+ item_name +","+ price);
                //writer.write(item_name);
                //writer.write(price);
                writer.close();
                System.out.println("\nEmployee has been Added :)\n");
                System.out.print("\nPress Enter to Continue...");
                sc.nextLine();
            } else {
                System.out.println("\nEmployee already exists :(");
                System.out.print("\nPress Enter to Continue...");
                sc.nextLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/

    public void addCoffee() {
        try {
            File file = new File("DataStock.txt");
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
    public void printInfo() {
        System.out.println("=> 0. Main Menu");
        System.out.println("\t ---------------------------------------- ");
        System.out.println("\t |  Item No.  |   Item Name   |  Price  | ");
        System.out.println("\t ---------------------------------------- ");
        try {
            BufferedReader read = new BufferedReader(new FileReader("DataStock.txt"));
            String message = "";
            while ((message = read.readLine()) != null) {
                String[] data = message.split(",");
                //System.out.println(Arrays.toString(data));
                System.out.printf("\t\t%s\t%s\t%s\n", data[0], data[1], data[2]);
            }
            read.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.print("\nPlace Your Order >>> ");
        order = sc.nextInt();
    }
    public int getOrder() {
        return order;
    }
}
