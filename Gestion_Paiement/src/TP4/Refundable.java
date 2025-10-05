package TP4;

public interface Refundable {
    void processRefund(double amount);
    default void logRefund(double amount) {
    	
    	System.out.println(amount);
    	
    }
}
