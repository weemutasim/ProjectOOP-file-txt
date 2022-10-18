import java.util.*;

public class CallingMain {
    public static void main(String[] args) {
        //clear the output Screen
        //System.out.print("\033[H\033[2J");

        Scanner sc = new Scanner(System.in);
        Admin am = new Admin(sc);
        Product pd = new Product(sc);
        Pay py = new Pay();
        Add_Data ad = new Add_Data(sc);
        Delete_Data dld = new Delete_Data();
        Edit_data edd = new Edit_data();
        Search_Data sd = new Search_Data();

        final String password;
        password = "123";

        // Calling Main Class function
        while (true) {
            if (am.getSelect() == 3) {
                System.out.println("THANKS");
                break;
            }
            am.printWelcome();
            am.setSelect(sc.nextInt());
            switch (am.getSelect()) {
                case 1:
                    while (true) {
                        pd.printInfo("DataStock.txt", 0);
                        System.out.print("\n\tPlace Your Order >>> ");
                        String messageID = sc.next();
                        int m_ID = Integer.parseInt(messageID);
                        int cancel = sd.searchData("DataStock.txt", messageID);
                        if (m_ID == 0 || cancel == 1) {
                            break;
                        }
                        System.out.print("\t\tEnter Item Quantity : ");
                        py.setQuantity(sc.nextInt());
                        System.out.println("\n     -------------------------------------------------");
                        sd.confirmOrder();
                        sd.setConfirm(sc.nextInt());
                        if (sd.getConfirm() == 1 && sd.getConfirm() <= 2) {
                            System.out.println("\n     -------------------------------------------------");
                            System.out.print("\t\tEnter amount of price : ");
                            py.setPrice(sc.nextInt());
                            System.out.print("\t\tEnter amount of paid : ");
                            py.setPaid(sc.nextInt());
                            System.out.println("\n     -------------------------------------------------");
                            System.out.printf("\tTotal price : %d Baht\n", py.calQuantity());
                            System.out.printf("\tChange money total : %d Baht\n", py.calChange());
                        } else {
                            System.out.println("Invalid!");
                        }
                    }
                    break;
                case 2:
                    am.loginMain();
                    if (am.getPass().equals(password)) {
                        //System.out.print("\033[H\033[2J");
                        System.out.println("       Access Granted! Welcome!");
                        do {
                            am.printMenu();
                            am.setSelectMenu(sc.nextInt());
                            switch (am.getSelectMenu()) {
                                case 1:
                                    py.totalCash();
                                    break;
                                case 2:
                                    //pd.getInfo();
                                    System.out.print("Enter Item No. >>> ");
                                    ad.setItem_no(sc.next());
                                    System.out.print("Enter Name >>> ");
                                    ad.setItem_name(sc.next());
                                    System.out.print("Enter Price >>> ");
                                    ad.setPrice(sc.next());
                                    ad.addCoffee("DataStock.txt");
                                    sc.nextLine();
                                    break;
                                case 3:
                                    System.out.print("\nEdit Item >> ");
                                    String search_id = sc.next();
                                    System.out.print("Enter edit name >> ");
                                    String new_name = sc.next();
                                    System.out.print("Enter edit price >> ");
                                    String new_price = sc.next();
                                    edd.editData("DataStock.txt", search_id, new_name, new_price);
                                    break;
                                case 4:
                                    pd.printInfo("DataStock.txt", 0);
                                    System.out.print("\nDelete Item >> ");
                                    int delete = sc.nextInt();
                                    dld.removeData("DataStock.txt", delete);
                                    break;
                                case 5:
                                    pd.printInfo("DataStock.txt", 1);
                                    sc.nextLine();
                                    break;
                                case 6:
                                
                                    break;
                                case 0:
                                    break;
                                default:
                                    System.out.println("Invalid!");
                                    break;
                            }
                        } while (am.getSelectMenu() != 0);
                    }
                    break;
                    case 3:
                        break;
                default:
                    System.out.println("Invalid!");
                    break;
            }
        }
    }
}
