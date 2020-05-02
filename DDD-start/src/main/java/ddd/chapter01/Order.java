package ddd.chapter01;

import java.util.List;

public class Order {

  private List<OrderLine> orderLines;
  private int totalAmounts;

  public Order(List<OrderLine> orderLines) {
    setOrderLines(orderLines);
  }

  private void setOrderLines(List<OrderLine> orderLines) {
    verifyAtLeastOneOrMoreOrderLines(orderLines);
    this.orderLines = orderLines;
    calculateTotalAmounts();
  }


  private void verifyAtLeastOneOrMoreOrderLines(List<OrderLine> orderLines) {
    if (orderLines == null || orderLines.isEmpty()) {
      throw new IllegalArgumentException("no OrderLine");
    }
  }

  private void calculateTotalAmounts() {
    this.totalAmounts = new Money(
        orderLines.stream()
            .mapToInt(x -> x.getAmounts().getValue())
            .sum()
    );
  }

  public void changeShipped() {
  }

  public void changeShippingInfo(ShippingInfo ne써Shipping) {
  }

  public void cancel() {
  }

  public void completePayment() {
  }

}
