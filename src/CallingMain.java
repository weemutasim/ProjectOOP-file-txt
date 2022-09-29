import java.util.*;

public class CallingMain {
    public static void main(String arv[]) {
        // clear the output Screen
        //System.out.print("\033[H\033[2J");

        Scanner rk = new Scanner(System.in);
        Admin am = new Admin(rk);
        Product pd = new Product(rk);

        String password;
        password = "123456";

        // Callining Mainmenu Class function
        while (true) {
            am.printWelcome();
            if (am.getSelect() == 3) {
                System.out.println("THANKS");
                break;
            }
            switch (am.getSelect()) {
                case 1:
                    pd.printInfo();
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
                                    System.out.print("Delete Item >>> ");
                                    int delete = rk.nextInt();
                                    pd.removeData("DataStock.txt", delete);
                                    break;
                                case 4:
                                    pd.getInfo();
                                    break;
                                case 5:
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
