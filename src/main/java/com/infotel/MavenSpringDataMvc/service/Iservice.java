package com.infotel.MavenSpringDataMvc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.query.Param;

import com.infotel.MavenSpringDataMvc.metier.Aerienne;
import com.infotel.MavenSpringDataMvc.metier.Routiere;
import com.infotel.MavenSpringDataMvc.metier.SocieteTransport;



public interface Iservice {

	public Routiere ajouterRoutiere(Routiere r);
	public  Routiere affichageRoutiere(int idCargaison);
	public  Routiere getRoutiere(int idCargaison);
	public Routiere modifierRoutiere(Routiere r);
	public void supprimerRoutiere(int idCargaison);
	public List<Routiere> findAllRoutieres();
	
	public Aerienne ajouterAerienne(Aerienne a);
	public Aerienne affichageAerienne(int idCargaison);
	public Aerienne getAerienne(int idCargaison);
	public Aerienne modifierAerienne( Aerienne a);
	public void supprimerAerienne(int idCargaison);
	public List<Aerienne> findAllAeriennes();
   
	public SocieteTransport ajouterSocieteTransport(SocieteTransport s);
	public SocieteTransport affichageSocieteTransport(int idSociete);
	public SocieteTransport getSocieteTransport(int idSociete);
	public SocieteTransport modifierSocieteTransport( SocieteTransport s);
	public void supprimerSocieteTransport(int idSociete);
	public List<SocieteTransport> findAllSocieteTransports();
	
	
	public void ajouterCargaisonSociete(int idSociete ,int idCargaison);
}
