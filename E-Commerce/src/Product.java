public class Product {
     private int product_Id;
     private String P_Name;
     private double P_price;
     private int stock;

     public Product (int product_Id, String P_Name, double P_price , int stock){
          this.product_Id = product_Id;
          this.P_Name = P_Name;
          this.P_price = P_price;
          this.stock = stock;
     }

     public int getProduct_Id(){
          return product_Id;
     }
     public String getP_Name(){
          return P_Name;
     }

     public double getP_price() {
          return P_price;
     }

     public int getStock() {
          return stock;
     }

     public void setP_Name(String p_Name) {
          P_Name = p_Name;
     }

     public void setP_price(double p_price) {
          P_price = p_price;
          if (p_price < 0 ){
               throw new IllegalArgumentException("Price invalid.");
          }
     }

     public void setStock(int stock) {
          this.stock = stock;
          if ( stock < 0 ){
               throw new IllegalArgumentException("Stock invalid");
          }
     }
}