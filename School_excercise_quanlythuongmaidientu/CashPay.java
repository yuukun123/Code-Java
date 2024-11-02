package School_excercise_quanlythuongmaidientu;

public class CashPay implements Payment {

    @Override
    public void payment(Order order) {
        if (order == null || order.getTotal() <= 0) {
            System.out.println("Order is empty. No payment required.");
        } else {
            System.out.println("Payment by cash for order " + order.getTotal());
        }
    }
}