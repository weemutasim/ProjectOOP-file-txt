import java.util.Scanner;

public class Admin {
    String password;
    int select, slmenu;
    Scanner sc;

    public Admin(Scanner rk) {
        sc=rk;
    }

    public void loginMain() {
        while (true) {
            System.out.print("Please Enter Password or ( 1 to Back in Main Menu ) : ");
            password = sc.next();
            int pass = Integer.parseInt(password);
            if (pass == 123456) {
                break;
            }else if (pass == 1) {
                break;
            } else {
                System.out.println("Invalid Password!");
            }
        }
    }
    /*public void setUser(String username) {
        this.username = username;
    }
    public void setPass(String password) {
        this.password = password;
    }*/
    public String getPass() {
        return password;
    }
    public void printWelcome() {
        //System.out.print("\033[H\033[2J");
        System.out.println("\nWELCOME TO COFFEE SHOP SYSTEM\n");
        System.out.println(">> 1. Costumer");
        System.out.println(">> 2. Admin Panel");
        System.out.println(">> 3. Exit");
        System.out.print("\nplease select >> ");
        select = sc.nextInt();
    }
    public int getSelect() {
        return select;
    }
    public void printMenu() {
        //System.out.print("\033[H\033[2J");
        System.out.println("\n>>>> Admin Panel <<<<");
        System.out.println("1. Total Cash Today");
        System.out.println("2. Add Coffee Item");
        System.out.println("3. Delete Item");
        System.out.println("4. Item List");
        System.out.println("5. Order Preview");
        System.out.println("0. Main Menu");
        System.out.print("\nEnter Your From 1-0 >> ");
        slmenu = sc.nextInt();
    }
    public int getSlmenu() {
        return slmenu;
    }
    
}
