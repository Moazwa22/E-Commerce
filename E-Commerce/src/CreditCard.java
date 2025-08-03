class CreditCard implements Payment {
    private String cardNumber;

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing...");
        System.out.println("_______________________");
        System.out.println("The amount is : " + amount );
    }

    @Override
    public boolean validateCard(String cardNumber) {
        return cardNumber != null && cardNumber.length() == 16;
    }
}
