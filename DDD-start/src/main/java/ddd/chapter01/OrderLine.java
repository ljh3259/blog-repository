package ddd.chapter01;

public class OrderLine {

  private Product product;
  private int price;
  private int quantity;
  private int amounts;

  public OrderLine(Product product, int price, int quantity, int amounts) {
    this.product = product;
    this.price = price;
    this.quantity = quantity;
    this.amounts = amounts;
  }

  /**
   * 구매가격을 계산한다.
   *
   * @return 개당 상품가격 * 구매 수량
   */
  private int calculateAmounts() {
    return price * quantity;
  }


  public int getAmounts() {
    return 0;
  }


}
