package reservation;

import java.time.Duration;
import java.util.List;

/**
 * 영화 요금을 계산하는 책임을 갖는다.
 */
public class Movie {

    private String title;
    private Duration runningTime;
    private Money fee;
    private List<DiscountCondition> discountConditions; // 할인 조건은 여러개 적용이 가능하기때문에 List 타입이다.

    private MoneyType moneyType;
    private Money discountAmount;
    private double discountPercent;

    /**
     * 영화요금을 계산한다.
     * @param screening
     * @return
     */
    public Money calculateMoviceFee(Screening screening) {
        // 영화 요금을 계산하기위해선 기본금액, 할인 조건, 할인 정책 등 정보가 필요하다.
        return null;
    }
}
