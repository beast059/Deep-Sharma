package com.example.SpringBootDeepAssign3Appplication;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/api")
public class PassengerController { 
	
	@Autowired
    PassengerService passengerService;

	@RequestMapping(value = "/passenger/{passengerId}", method = RequestMethod.GET)
    Passenger getPassenger(@PathVariable("passengerId") int passengerId) throws Exception {
        return passengerService.getPassenger(passengerId);
    }

	@RequestMapping(value = "/passengers", method = RequestMethod.GET)
    Iterable<Passenger> getTickets() {
        return passengerService.getPassengers();
    }

    @RequestMapping(value = "/passenger", method = RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseStatus(value = HttpStatus.OK)
    void addPassenger(@RequestBody Passenger p, Model model, HttpServletResponse response) throws Exception {
    	passengerService.addPassenger(p);
    }
    
    @RequestMapping(value = "/add-passenger", method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    void addPassengerForm(Passenger p, Model model, HttpServletResponse response) throws Exception {
    	String responseUrl="/passengers";
		try {
			passengerService.addPassenger(p);
		}catch(Exception e) {
			responseUrl="/add-passenger?error="+e.getMessage();
		}
		response.sendRedirect(responseUrl);
    }

    @RequestMapping(value = "/passenger/{passengerId}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    void updateEmployee(@PathVariable("passengerId") int passengerId, @RequestBody Passenger p) throws Exception {
        p.setPassengerId(passengerId);
        passengerService.updatePassenger(p);
    }

    @RequestMapping(value = "/passenger/{passengerId}", method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.OK)
    void deleteEmployee(@PathVariable("passengerId") int passengerId) throws Exception {
    	passengerService.deletePassenger(passengerId);
    }
}
