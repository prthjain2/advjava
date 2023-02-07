package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Vehical;
import com.app.service.IvehicalService;

@RestController
@RequestMapping("/api/veh")
@CrossOrigin(origins = "http://localhost:3000")
public class VehicalController {
	@Autowired
	private IvehicalService vehService;

	public VehicalController() {
		System.out.println("constroctor"+getClass());
	}
	@GetMapping
	public List<Vehical>allVehical(){
		return vehService.gatAllVehical();
		
	}
	@PostMapping
	public Vehical savevehicals(@RequestBody Vehical vehi) {
		return vehService.saveDetails(vehi);
	}
	
	@DeleteMapping("/{id}")
	public String deleteVehical(@PathVariable int id) {
		return vehService.deleteVehical(id);
	}
	
	
}
