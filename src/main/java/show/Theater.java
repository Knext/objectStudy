package show;

import lombok.*;
import visitor.*;

@AllArgsConstructor
public class Theater {
    private TicketSeller ticketSeller;

    public void enter(Audience audience) {
        ticketSeller.sellTo(audience);
    }
}
