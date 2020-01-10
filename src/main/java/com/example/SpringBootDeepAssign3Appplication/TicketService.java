package com.example.SpringBootDeepAssign3Appplication;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;
@Service
public class TicketService {
	Map<Integer, Ticket> Tickets = new HashMap<Integer, Ticket>();

    public void addTicket(Ticket p) throws Exception {
        if(Tickets.containsKey(p.getTicketId())) {
            throw new Exception("Ticket Id already exists");
        }
        else {
        	Tickets.put(p.getTicketId(), p);
        }
    }

    public Iterable<Ticket> getTickets(){
        return Tickets.values();
    }

    public Ticket getTicket(int TicketId) throws Exception {

        if(Tickets.containsKey(TicketId)) {
            return Tickets.get(TicketId);
        }
        else {
        	throw new Exception("Ticket Id not found");
        }
    }

    public void updateTicket(Ticket p) throws Exception {
        if(Tickets.containsKey(p.getTicketId())) {
            Tickets.put(p.getTicketId(), p);
        }
        else {
            throw new Exception("Ticket Id not found");
        }
    }


    public void deleteTicket(int TicketId) throws Exception {
        if(Tickets.containsKey(TicketId)) {
            Tickets.remove(TicketId);
        }
        else {
            throw new Exception("Ticket Id not found");
        }
    }
}
