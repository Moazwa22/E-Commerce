public class Admin extends User {
    public Admin (int userId, String userName, String email){
        super(userId,userName,email);
    }
    public void updateProduct (Product P, double newPrice, int newStock){
         P.setP_price(newPrice);
         P.setStock(newStock);
        System.out.println( userName + "Updated this product : " + P.getP_Name());

    }
    @Override
    public String getUserDetails() {
        return "Admin: " + userName + ",  Email: " + email + ",   User ID: " + userId;
    }
}
