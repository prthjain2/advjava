package com.app.service;

import java.util.List;

import com.app.pojos.Vehical;

public interface IvehicalService {
	List<Vehical>gatAllVehical();
	
	public Vehical saveDetails(Vehical transientveh);
	
	public String deleteVehical(int id) ;
		
	
}
