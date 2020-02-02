package movie;

import lombok.*;
import movie.numbers.*;

@AllArgsConstructor
public class Reservation {
    private Customer customer;
    private Screening screening;
    private Money money;
    private int audicencCount;
}
