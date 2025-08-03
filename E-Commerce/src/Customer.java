public class Customer extends User{
    public Customer (int userId, String userName, String email){
        super(userId,userName,email);
    }

    @Override
    public String getUserDetails() {
        return "Customer: " + userName + ",   Email: " + email + ",   User ID: " + userId;
    }
    public void placeOrder(int productId) {
        System.out.println(userName + " placed an order for product ID: " + productId);
    }

    public void placeOrder(int productId, int N_Of_Products) {
        System.out.println(userName + " placed an order for product ID: " + productId + " with quantity: " + N_Of_Products);
    }
}
