package movie.discount.policy;

import movie.*;
import movie.discount.condition.*;
import movie.numbers.*;

public class AmountDiscountPolicy extends DefaultDiscountPolicy {

    private final Money discountAmount;

    public AmountDiscountPolicy(Money discountAmount, DiscountCondition... conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return this.discountAmount;
    }
}
