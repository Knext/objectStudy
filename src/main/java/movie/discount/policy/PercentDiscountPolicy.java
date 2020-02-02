package movie.discount.policy;

import movie.*;
import movie.discount.condition.*;
import movie.numbers.*;

public class PercentDiscountPolicy extends DefaultDiscountPolicy {

    private final Percent percent;

    public PercentDiscountPolicy(Percent percent, DiscountCondition... conditions) {
        super(conditions);
        this.percent = percent;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getMovieFee().times(percent.toPoint());
    }
}
