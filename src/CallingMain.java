import java.util.*;

public class CallingMain {
    public static void main(String[] args) {
        // clear the output Screen
        //System.out.print("\033[H\033[2J");

        Scanner rk = new Scanner(System.in);
        Admin am = new Admin(rk);
        Product pd = new Product(rk);

        String password;
        password = "123";

        // Callining Mainmenu Class function
        while (true) {
            am.printWelcome();
            if (am.getSelect() == 3) {
                System.out.println("THANKS");
                break;
            }
            switch (am.getSelect()) {
                case 1:
                    pd.printInfo(0);
                    break;
                case 2:
                    am.loginMain();
                    if (am.getPass().equals(password)) {
                        System.out.println("Access Granted! Welcome!");
                        do {
                            am.printMenu();
                            switch (am.getSlmenu()) {
                                case 1:
                                    
                                    break;
                                case 2:
                                    pd.getInfo();
                                    pd.addCoffee();
                                    break;
                                case 3:
                                    pd.printInfo(1);    //admin 0, costumer 1
                                    System.out.print("\nDelete Item >> ");
                                    int delete = rk.nextInt();
                                    pd.removeData("DataStock.txt", delete);
                                    break;
                                case 4:
                                    pd.printInfo(1);
                                    break;
                                case 5:
                                    System.out.print("\nEdit Item >> ");
                                    String search_id = rk.next();
                                    System.out.print("Enter edit name >> ");
                                    String new_name = rk.next();
                                    System.out.print("Enter edit price >> ");
                                    String new_price = rk.next();
                                    pd.editData("DataStock.txt", search_id, new_name, new_price);
                                    break;
                                case 0:
                                    break;
                                default:
                                    System.out.println("Invalid!");
                                    break;
                            }
                        } while (am.getSlmenu() != 0);
                    }
                    break;
                default:
                    System.out.println("Invalid!");
                    break;
            }
        }
    }
}
