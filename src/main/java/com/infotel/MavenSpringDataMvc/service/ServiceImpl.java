package com.infotel.MavenSpringDataMvc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.infotel.MavenSpringDataMvc.dao.RoutiereRepository;

import com.infotel.MavenSpringDataMvc.metier.Routiere;

public class ServiceImpl implements Iservice {
    @Autowired
	RoutiereRepository routiereRepository;

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

}