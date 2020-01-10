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
public class FlightController { 
	
	@Autowired
    FlightService FlightService;
	
	@ResponseBody
	@RequestMapping("1")
	public String home()
	{
		return "Creat an Flight Web service";
	}

    @RequestMapping(value = "/flight/{FlightId}", method = RequestMethod.GET)
    Flight getFlight(@PathVariable("FlightId") int FlightId) throws Exception {
        return FlightService.getFlight(FlightId);
    }

    @RequestMapping(value = "/flights", method = RequestMethod.GET)
    Iterable<Flight> getFlights() {
        return FlightService.getFlights();
    }

    @RequestMapping(value = "/flight", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    void addFlight(@RequestBody Flight p) throws Exception {
    	FlightService.addFlight(p);
    }

    @RequestMapping(value = "/flight/{flightId}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    void updateEmployee(@PathVariable("flightId") int flightId, @RequestBody Flight p) throws Exception {
        p.setFlightId(flightId);
        FlightService.updateFlight(p);
    }

    @RequestMapping(value = "/flight/{flightId}", method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.OK)
    void deleteEmployee(@PathVariable("flightId") int flightId) throws Exception {
    	FlightService.deleteFlight(flightId);
    }
}
