import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        Product P1 = new Product(50, "keyboard", 1200.0, 10);

        Customer customer = new Customer(1, "Moaz", "moazwsq@gmail.com");
        Admin admin = new Admin(2, "adminUser", "Mohamed12@gmail.com");

        System.out.println(customer.getUserDetails());
        System.out.println(admin.getUserDetails());


        customer.placeOrder(P1.getProduct_Id(), 2);

        admin.updateProduct(P1, 1100.0, 8);

        Payment creditPayment = new CreditCard();
        String cardNumber = "4872231160212223";
        if (creditPayment.validateCard(cardNumber)) {
            creditPayment.processPayment(1100.0);
        } else {
            System.out.println("Invalid credit card.");
        }
    }
}
