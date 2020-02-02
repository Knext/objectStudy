package movie;

import java.time.*;
import lombok.*;
import movie.numbers.*;

@Getter
@AllArgsConstructor
@ToString
public class Screening {
    private Movie movie;
    private int sequence;
    private LocalDateTime startTime;

    public boolean isSequence(int sequence) {
        return this.sequence == sequence;
    }

    public Money getMovieFee() {
        return movie.getFee();
    }

    public Reservation reserve(Customer customer, int audicencCount) {
       return new Reservation(customer, this, calculateFee(audicencCount), audicencCount);
    }

    private Money calculateFee(int audicencCount) {
        return movie.calculateFee(this).times(audicencCount);
    }
}
