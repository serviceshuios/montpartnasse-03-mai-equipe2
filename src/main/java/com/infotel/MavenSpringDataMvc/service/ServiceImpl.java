package com.infotel.MavenSpringDataMvc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotel.MavenSpringDataMvc.dao.AerienneRepository;
import com.infotel.MavenSpringDataMvc.dao.RoutiereRepository;
import com.infotel.MavenSpringDataMvc.metier.Aerienne;
import com.infotel.MavenSpringDataMvc.metier.Routiere;
@Service
public class ServiceImpl implements Iservice {
    @Autowired
	RoutiereRepository routiereRepository;
    @Autowired 
    AerienneRepository aerienneRepository;
    

	public AerienneRepository getAerienneRepository() {
		return aerienneRepository;
	}

	public void setAerienneRepository(AerienneRepository aerienneRepository) {
		this.aerienneRepository = aerienneRepository;
	}

	public RoutiereRepository getRoutiereRepository() {
		return routiereRepository;
	}

	public void setRoutiereRepository(RoutiereRepository routiereRepository) {
		this.routiereRepository = routiereRepository;
	}

	@Override
	public Routiere ajouterRoutiere(Routiere r) {
		// TODO Auto-generated method stub
		return routiereRepository.save(r);
	}

	

	@Override
	public Routiere modifierRoutiere(Routiere r) {
		// TODO Auto-generated method stub
		return routiereRepository.save(r);
	}

	@Override
	public void supprimerRoutiere(int idCargaison) {
		// TODO Auto-generated method stub
		routiereRepository.deleteById(idCargaison);
	}

	@Override
	public List<Routiere> findAllRoutieres() {
		// TODO Auto-generated method stub
		return routiereRepository.findAll();
	}

	@Override
	public Routiere affichageRoutiere(int idCargaison) {
		// TODO Auto-generated method stub
		return routiereRepository.findById(idCargaison).get();
	}
	
	@Override
	public Routiere getRoutiere(int idCargaison) {
		// TODO Auto-generated method stub
		return routiereRepository.findById(idCargaison).get();
	}

	@Override
	public Aerienne ajouterAerienne(Aerienne a) {
		// TODO Auto-generated method stub
		return aerienneRepository.save(a);
	}

	@Override
	public Aerienne affichageAerienne(int idCargaison) {
		// TODO Auto-generated method stub
		return aerienneRepository.findById(idCargaison).get();
	}

	@Override
	public Aerienne getAerienne(int idCargaison) {
		// TODO Auto-generated method stub
		return aerienneRepository.findById(idCargaison).get();
	}

	@Override
	public Aerienne modifierAerienne(Aerienne a) {
		// TODO Auto-generated method stub
		return aerienneRepository.save(a);
	}

	@Override
	public void supprimerAerienne(int idCargaison) {
		// TODO Auto-generated method stub
		aerienneRepository.deleteById(idCargaison);
		
	}

	@Override
	public List<Aerienne> findAllAeriennes() {
		// TODO Auto-generated method stub
		return aerienneRepository.findAll();	
		}

}