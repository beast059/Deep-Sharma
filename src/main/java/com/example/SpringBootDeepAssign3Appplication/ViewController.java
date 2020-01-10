package com.example.SpringBootDeepAssign3Appplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ViewController {

	@Autowired
	PassengerService passengerService;

	@RequestMapping(value = "/add-passengers", method = RequestMethod.GET)
	String addPassenger() throws Exception {
		return "add-passenger";
	}

	@RequestMapping(value = "/passengers", method = RequestMethod.GET)
	String getPassengers(Model model) throws Exception {
		model.addAttribute("passengers", passengerService.getPassengers());
		return "passengers";
	}

	@RequestMapping(value = "/view-passenger/{passengerId}", method = RequestMethod.GET)
		String getPassenger(@PathVariable("passengerId") int passengerId, Model model) throws Exception {
		model.addAttribute("passenger", passengerService.getPassenger(passengerId));
		return "view-passenger";
	}
	
	@RequestMapping(value = "/edit-passenger/{passengerId}", method = RequestMethod.GET)
	String editPassenger(@PathVariable("passengerId") int passengerId, Model model) throws Exception {
		model.addAttribute("passenger", passengerService.getPassenger(passengerId));
		return "edit-passenger";
	}
	
	@RequestMapping(value = "/delete-passenger/{passengerId}", method = RequestMethod.GET)
	String deletePassenger(@PathVariable("passengerId") int passengerId, Model model) throws Exception {
		passengerService.deletePassenger(passengerId);	
		return "passengers";
	}
}
