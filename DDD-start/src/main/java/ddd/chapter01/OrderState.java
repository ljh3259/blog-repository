package ddd.chapter01;

/**
 * 주문 상태 정보.
 */
public enum OrderState {
  WATTING,
  PAYMENT_WAITING,
  PREPARING,
  SHIPPED,
  DELIVERING,
  DELIVERY_COMPLETED,
  CANCELED;

}
