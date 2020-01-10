package com.example.SpringBootDeepAssign3Appplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class TicketController { 
	
	@Autowired
    TicketService TicketService;
	
	@ResponseBody
	@RequestMapping("2")
	public String home()
	{
		return "Creat an Ticket Web service";
	}

    @RequestMapping(value = "/ticket/{TicketId}", method = RequestMethod.GET)
    Ticket getTicket(@PathVariable("TicketId") int TicketId) throws Exception {
        return TicketService.getTicket(TicketId);
    }

    @RequestMapping(value = "/tickets", method = RequestMethod.GET)
    Iterable<Ticket> getTickets() {
        return TicketService.getTickets();
    }

    @RequestMapping(value = "ticket", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    void addTicket(@RequestBody Ticket p) throws Exception {
    	TicketService.addTicket(p);
    }

    @RequestMapping(value = "/ticket/{ticketId}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    void updateEmployee(@PathVariable("ticketId") int ticketId, @RequestBody Ticket p) throws Exception {
        p.setTicketId(ticketId);
        TicketService.updateTicket(p);
    }

    @RequestMapping(value = "/ticket/{ticketId}", method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.OK)
    void deleteEmployee(@PathVariable("ticketId") int ticketId) throws Exception {
    	TicketService.deleteTicket(ticketId);
    }
}
