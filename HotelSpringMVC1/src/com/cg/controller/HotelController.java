package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



import com.cg.entity.Customer;
import com.cg.entity.Hotel;

import com.cg.service.IHotelService;

@Controller
public class HotelController {
	
	@Autowired
	public IHotelService hotelService;
	
	@RequestMapping("/booking1")
	public String getHomePage(Model model){
		model.addAttribute("customerList",hotelService.loadAl());
	
	model.addAttribute("customer",new Customer());
	return "booking1";
	}
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String saveCustomer(@ModelAttribute("customer") Customer customer, Model model){
		customer = hotelService.save(customer);
		model.addAttribute("message","Customer with id "+customer.getId()+" added successfully!");
		return "redirect:/booking1.html";
	}
	
	
	@RequestMapping("/hotel")
	public String getHotelPage(Model model){
		
		model.addAttribute("hotelList", hotelService.loadAll());
		model.addAttribute("hotel", new Hotel());
		
		return "hotel";
		
	}

	@RequestMapping("/index")
	public String getMoviePage(Model model){
		
		return "index";
		
	}
	@RequestMapping(value= "/hello", method=RequestMethod.GET)
	public String showPage(@RequestParam(value="hname") String name,Model model){
		
		model.addAttribute("name", name);
		
	
		return "success";
	}

	
	
	
	

}
