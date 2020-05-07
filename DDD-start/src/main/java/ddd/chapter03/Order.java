package ddd.chapter03;

import ddd.chapter01.OrderState;
import ddd.chapter01.ShippingInfo;

public class Order {

  private OrderState state;
  private ShippingInfo shippingInfo;

  //애그리거트 루트는 도메인 규칙을 구현한 기능을 제공한다.
  public void changeShippingInfo(ShippingInfo newShippingInfo) {
    verifyNotYetShipped();
    setShippingInfo(newShippingInfo);
  }

  private void setShippingInfo(ShippingInfo newShippingInfo) {
    if (state != OrderState.PAYMENT_WAITING && state != OrderState.WATTING)
      throw new IllegalStateException("aleady shipped");
  }

  private void verifyNotYetShipped() {
  }

}

