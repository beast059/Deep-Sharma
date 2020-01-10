package com.example.SpringBootDeepAssign3Appplication;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;
@Service
public class PassengerService {
	Map<Integer, Passenger> passengers = new HashMap<Integer, Passenger>();

    public void addPassenger(Passenger p) throws Exception {
        if(passengers.containsKey(p.getPassengerId())) {
            throw new Exception("Passenger Id already exists");
        }
        else {
        	passengers.put(p.getPassengerId(), p);
        	System.out.println(p.getFirstName()+" added");
        }
    }

    public Iterable<Passenger> getPassengers(){
        return passengers.values();
    }

    public Passenger getPassenger(int passengerId) throws Exception {

        if(passengers.containsKey(passengerId)) {
            return passengers.get(passengerId);
        }
        else {
        	System.out.println("passenger: "+passengerId);
            throw new Exception("Passenger Id not found");
        }
    }

    public void updatePassenger(Passenger p) throws Exception {
        if(passengers.containsKey(p.getPassengerId())) {
            passengers.put(p.getPassengerId(), p);
        }
        else {
            throw new Exception("Passenger Id not found");
        }
    }


    public void deletePassenger(int passengerId) throws Exception {
        if(passengers.containsKey(passengerId)) {
            passengers.remove(passengerId);
        }
        else {
            throw new Exception("Passenger Id not found");
        }
    }
}
