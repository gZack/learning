package temp.lab4;

import java.util.Date;

public class Order {

    private String orderNo;
    private Date orderDate;
    private double orderAmount;

    public Order(final String orderNo, final Date orderDate,
                 final double orderAmount){
        this.orderAmount = orderAmount;
        this.orderDate = orderDate;
        this.orderNo = orderNo;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public double getOrderAmount() {
        return orderAmount;
    }
}
