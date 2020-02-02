package movie.discount.condition;

import java.time.*;
import lombok.*;
import movie.*;

@AllArgsConstructor
public class PeriodCondition implements DiscountCondition{
    private final DayOfWeek dayOfWeek;
    private LocalTime startTime;
    private LocalTime endTime;

    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return screening.getStartTime().getDayOfWeek().equals(this.dayOfWeek) &&
                startTime.compareTo(screening.getStartTime().toLocalTime()) <=0 &&
                endTime.compareTo(screening.getStartTime().toLocalTime()) >= 0;
    }
}
