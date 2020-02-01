package show;

import lombok.*;
import visitor.*;

@AllArgsConstructor
public class TicketSeller {
    private TicketOffice ticketOffice;

    public void sellTo(Audience audience) {
        this.ticketOffice.sellTicketTo(audience);
    }
}
