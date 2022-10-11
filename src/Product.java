import java.util.*;
import javax.swing.*;
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

    public void printInfo(String file, int admin) {
        System.out.println("=> 0. Main Menu");
        System.out.println("\t ---------------------------------------- ");
        System.out.println("\t |  Item No.  |   Item Name   |  Price  | ");
        System.out.println("\t ---------------------------------------- ");
        try {
            BufferedReader read = new BufferedReader(new FileReader(file));
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
        if (admin == 1) {
            System.out.print("\nPress Enter to Continue...");
            sc.nextLine();
        }
        
        
    }
    public int getOrder() {
        return order;
    }

    public void removeData(String file, int deleteLine) {
        int line = 0;
        String currentLint;

        String tempFile = "temp.txt";
        File oldFile = new File(file);
        File newFile = new File(tempFile);

        try {
            FileWriter fw = new FileWriter(tempFile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            while ((currentLint = br.readLine()) != null) {
                line++;
                if (deleteLine != line) {
                    pw.println(currentLint);
                }
            }
            pw.flush();
            pw.close();
            fr.close();
            br.close();
            bw.close();
            fw.close();

            oldFile.delete();
            File dump = new File(file);
            newFile.renameTo(dump);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void editData(String file, String editID, String new_name, String new_price) {
        String old_id = "";
        String old_name = "";
        String old_price = "";
        String tempFile = "temp.txt";
        File oldFile = new File(file);
        File newFile = new File(tempFile);

        try {
            FileWriter fw = new FileWriter(tempFile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            sc = new Scanner(new File(file));
            sc.useDelimiter("[,\n]");

            while (sc.hasNext()) {
                old_id = sc.next();
                old_name = sc.next();
                old_price = sc.next();

                if (old_id.equals(editID)) {
                    pw.println(old_id +","+new_name +","+ new_price);
                } else {
                    pw.print(old_id +","+ old_name +","+ old_price);
                }
            }
            sc.close();
            pw.flush();
            pw.close();

            oldFile.delete();
            File dump = new File(file);
            newFile.renameTo(dump);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*public void searchData(String file) { //String file
        String line = "";
        System.out.print("\nPlace Your Order >>> ");
        String message = sc.next();
        try {
            FileInputStream fin = new FileInputStream(file);
            Scanner scan = new Scanner(fin);
            scan.useDelimiter("[,\n]");
            while (scan.hasNextLine()) {
                String[] data = line.split(",");
                line = scan.nextLine();
                if (line.startsWith(message)) {
                    System.out.println(data[0]+ "\t"+ data[1]+ "\t"+ Double.parseDouble(data[2]));
                } 

            }    
            scan.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/

    public void searchData(String file, String searchID) {
        boolean found = false;
        String id = "";
        String name = "";
        String price = "";

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
                System.out.println("ID: "+id+ "\tName: "+ name +"\tPrice: "+ price);
            } else {
                System.out.println("Record not found!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

