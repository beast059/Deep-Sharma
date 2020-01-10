package com.example.SpringBootDeepAssign3Appplication;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;
@Service
public class FlightService {
	Map<Integer, Flight> flights = new HashMap<Integer, Flight>();

    public void addFlight(Flight p) throws Exception {
        if(flights.containsKey(p.getFlightId())) {
            throw new Exception("Flight Id already exists");
        }
        else {
        	flights.put(p.getFlightId(), p);
        }
    }

    public Iterable<Flight> getFlights(){
        return flights.values();
    }

    public Flight getFlight(int FlightId) throws Exception {

        if(flights.containsKey(FlightId)) {
            return flights.get(FlightId);
        }
        else {
        	System.out.println("Flight: "+FlightId);
            throw new Exception("Flight Id not found");
        }
    }

    public void updateFlight(Flight p) throws Exception {
        if(flights.containsKey(p.getFlightId())) {
            flights.put(p.getFlightId(), p);
        }
        else {
            throw new Exception("Flight Id not found");
        }
    }


    public void deleteFlight(int FlightId) throws Exception {
        if(flights.containsKey(FlightId)) {
            flights.remove(FlightId);
        }
        else {
            throw new Exception("Flight Id not found");
        }
    }
}
