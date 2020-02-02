package movie.discount.policy;

import movie.*;
import movie.numbers.*;

public class NoneDiscountPolicy extends DefaultDiscountPolicy {

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
