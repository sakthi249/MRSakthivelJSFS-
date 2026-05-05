
class Payment{
    void processPayment(){
      System.out.println("Processing Payment");
    }
}
class CreditCardPayment extends Payment{
void processPayment(){
    System.out.println("Processing payment using credit card");
}
}
class DebitCardPayment extends Payment{
void processPayment(){
    System.out.println("Processing payment using debit card");
}
}
class UPIPayment extends Payment{
void processPayment(){
    System.out.println("Processing payment through UPI");
}
}
public class task1 {
public static void main(String[] args) {
    Payment pay = new CreditCardPayment();
    pay.processPayment();
    pay = new DebitCardPayment();
    pay.processPayment();
    pay = new UPIPayment();
    pay.processPayment();
}   

}