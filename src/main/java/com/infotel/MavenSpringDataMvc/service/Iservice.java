package com.infotel.MavenSpringDataMvc.service;

import java.util.List;
import java.util.Optional;


import com.infotel.MavenSpringDataMvc.metier.Routiere;



public interface Iservice {

	public Routiere ajouterRoutiere(Routiere r);
	public  Routiere affichageRoutiere(int idCargaison);
	public  Routiere getRoutiere(int idCargaison);
	public Routiere modifierRoutiere(Routiere r);
	public void supprimerRoutiere(int idCargaison);
	public List<Routiere> findAllRoutieres();
	
   	
}
