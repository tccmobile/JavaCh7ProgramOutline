import java.util.ArrayList;

public class ShoppingCart {
    private String customerName;
    private String currentDate;
    private ArrayList<ItemToPurchase> cartItems;

    public ShoppingCart() {
        //customerName = "none";
        customerName = new String("none");
        currentDate = "January 1, 2016";
        cartItems  = new ArrayList<ItemToPurchase>();
    }

    public ShoppingCart(String customerName, String currentDate) {
        this.customerName = customerName;
        this.currentDate = currentDate;
        cartItems = new ArrayList<ItemToPurchase>();
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getDate() {
        return currentDate;
    }

    void addItem(ItemToPurchase item){

    }

    void removeItem(String name){

    }

    void modifyItem(ItemToPurchase item){

    }

    int getNumItemsInCart(){
        int total = 0;

        return total;
    }

    int getCostOfCart(){
        int cost = 0;

        return cost;
    }

    void printTotal(){

    }

    void printDescriptions(){

    }
}
