package TP4;

public interface PaymentMethod {
    final double TRANSACTION_FEE=0.05;
    void processPayement(double amount) ;
    boolean validatePayment();
    default double applyDiscount(double amount , double discountPercentage) {
     return amount*discountPercentage;
     }
    
    
    
    
}
