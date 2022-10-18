public class Pay {
    int total = 0;
    private int paid;
    private int quantity;
    private int price;
    int result;

    //Default constructor
    Pay () {
        
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPaid(int paid) {
        this.paid = paid;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPaid() {
        return paid;
    }

    public int getPrice() {
        return price;
    }

    public int calQuantity() {
        result = quantity * price;
        return result;
    }

    public int calChange() {
        int change = paid - result;
        return change;
    }

    public void totalCash() {
        total += result;
        System.out.println("\n     -------------------------------------------------");
        System.out.printf("Todays Total Cash : %d\n", total);

    }
}
