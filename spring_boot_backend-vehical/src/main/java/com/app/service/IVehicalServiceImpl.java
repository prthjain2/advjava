package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.VehicalRepository;
import com.app.pojos.Vehical;

@Service
@Transactional
public class IVehicalServiceImpl implements IvehicalService {
	@Autowired
	private VehicalRepository vehicalRepo;

	@Override
	public List<Vehical> gatAllVehical() {

		return vehicalRepo.findAll();
	}

	@Override
	public Vehical saveDetails(Vehical transientveh) {

		return vehicalRepo.save(transientveh);
	}

	@Override
	public String deleteVehical(int id) {
		String msg = "not delete";
		if (vehicalRepo.existsById(id)) {

			vehicalRepo.deleteById(id);
			System.out.println("delete");
		}

		return msg;
	}

}
