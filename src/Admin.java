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

    public String getPass() {
        return password;
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
        select = sc.nextInt();
    }
    
    public int getSelect() {
        return select;
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
        slmenu = sc.nextInt();
    }

    public int getSlmenu() {
        return slmenu;
    }

    /*public static void arrayList(String file) {
        ArrayList<Coffee> cf = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = br.readLine();
            while ((line = br.readLine()) != null) {
                String[] split = line.split(",");
                cf.add(new Coffee(split[0], Double.parseDouble(split[1])));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void arraySearcher(String coffee) {
        for (int i = 0; i < cf.size; i++) {
            
        }
    }*/
}
