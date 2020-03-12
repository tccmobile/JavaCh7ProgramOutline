import java.util.Scanner;

public class ShoppingCartManager {
    public static Scanner scanner = new Scanner(System.in);


    public static char printMenu(ShoppingCart myCart){
        char choice = '?';

        System.out.println("\nMENU");
        System.out.println("a - Add item to cart");
        System.out.println("d - Remove item from cart");
        System.out.println("c - Change item quantity");
        System.out.println("i - Output items' descriptions");
        System.out.println("o - Output shopping cart");
        System.out.println("q - Quit");
        System.out.println("\nChoose an option:");

        choice = scanner.next().charAt(0);


        return choice;
    }


    public static void main(String[] args) {
        String name, date;
        char choice;

        System.out.println("Enter Customer's Name:");
        name = scanner.nextLine();
        System.out.println("Enter Today's Date:");
        date = scanner.nextLine();

        System.out.println("\nCustomer Name: "+name);
        System.out.println("Today's Date: "+date);

        ShoppingCart myCart = new ShoppingCart(name,date);

        do{
            choice = printMenu(myCart);
        } while (choice!='q');




    }
}
