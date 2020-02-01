package visitor;

import lombok.*;
import show.*;

@AllArgsConstructor
public class Audience {
    private Bag bag;

    public Long buy(Ticket ticket) {
       return bag.addTicket(ticket);
    }
}
