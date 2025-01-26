package multilevelinheritance.onlineretailordermanagement;

public class ShipedOrder extends Order{
    private String trackingNumber;

    public ShipedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public void getOrderStatus() {
        super.getOrderStatus();
        System.out.println("Tracking Number: " + trackingNumber);
        System.out.println("Status: Order shipped.");
    }

}
