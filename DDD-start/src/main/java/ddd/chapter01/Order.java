package ddd.chapter01;

import java.util.List;

public class Order {

  private List<OrderLine> orderLines;
  private Money totalAmounts;
  private ShippingInfo shippingInfo;

  public Order(List<OrderLine> orderLines, ShippingInfo shippingInfo) {
    setOrderLines(orderLines);
    setShippingInfo(shippingInfo);
  }

  private void setShippingInfo(ShippingInfo shippingInfo) {
    if (shippingInfo == null) {
      throw new IllegalArgumentException("no ShippingInfo");
    }
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
            .mapToInt(OrderLine::getAmounts)
            .sum()
    );
  }

  public void changeShipped() {
  }

  public void changeShippingInfo(ShippingInfo newShipping) {
  }

  public void cancel() {
  }

  public void completePayment() {
  }

}
