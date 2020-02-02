package movie.discount.condition;

import lombok.*;
import movie.*;

@AllArgsConstructor
public class SequenceCondition implements DiscountCondition {
    private final int sequence;

    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return screening.isSequence(this.sequence);
    }
}
