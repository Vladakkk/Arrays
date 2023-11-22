package app;
import java.util.Scanner;
public class Main {
    static String[] products;
    static int count;

    public static void main(String[] args) {

        products = new String[]{"Apple", "Orange", "Cherry", "Apple", "Papaya", "Cherry", "Banana", "Banana"};
        for (String prod : products) {
            count++;
            System.out.println(count + ") Name of product is " + prod);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter product name: ");
        String searchName = sc.nextLine();
        for (String prod : products) {
            if (prod.equals(searchName)) {
                System.out.println("Product '" + searchName + "' is found in the list");
            }
        }
    }
}