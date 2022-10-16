import java.util.Scanner;

public class Admin {
    private String password;
    private int select;
    private int select_menu;
    Scanner sc;

    //Default constructor
    public Admin() {

    }

    //Overloading Method
    public Admin(Scanner sc) {
        this.sc = sc;
    }

    public void loginMain() {
        while (true) {
            System.out.print("\nPlease Enter Password or ( 1 to Back in Main Menu ) : ");
            password = sc.next();
            int pass = Integer.parseInt(password);
            if (pass == 123) {
                break;
            }else if (pass == 1) {
                break;
            } else {
                System.out.println("Invalid Password!");
            }
        }
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSelect(int select) {
        this.select = select;
    }

    public void setSelectMenu(int select_menu) {
        this.select_menu = select_menu;
    }

    public String getPass() {
        return password;
    }

    public int getSelect() {
            return select;
    }

    public int getSelectMenu() {
        return select_menu;
    }

    public void printWelcome() {
        //System.out.print("\033[H\033[2J");
        System.out.println("\n       WELCOME TO COFFEE SHOP SYSTEM\n");
        System.out.println("     ---------------------------------");
        System.out.println("\t>> 1. Costumer");
        System.out.println("\t>> 2. Admin Panel");
        System.out.println("\t>> 3. Exit");
        System.out.println("     ---------------------------------");
        System.out.print("\tplease select >> ");
    }

    public void printMenu() {
        //System.out.print("\033[H\033[2J");
        System.out.println("\n\t>>>> Admin Panel <<<<");
        System.out.println("     -------------------------");
        System.out.println("\t1. Total Cash Today");
        System.out.println("\t2. Add Coffee Item");
        System.out.println("\t3. Update Coffee Item");
        System.out.println("\t4. Delete Item");
        System.out.println("\t5. Item List");
        System.out.println("\t6. Order Preview");
        System.out.println("\t0. Main Menu");
        System.out.println("     -------------------------");
        System.out.print("\tEnter Your From 1-0 >> ");
    }
}
