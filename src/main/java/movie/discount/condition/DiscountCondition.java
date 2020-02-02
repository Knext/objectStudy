package movie.discount.condition;

import movie.*;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
