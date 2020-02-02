package movie.discount.policy;

import movie.*;
import movie.numbers.*;

public interface DiscountPolicy {
    Money calculateDiscountAmount(Screening screening);
}
