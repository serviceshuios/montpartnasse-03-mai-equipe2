package com.infotel.MavenSpringDataMvc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.infotel.MavenSpringDataMvc.metier.Aerienne;
import com.infotel.MavenSpringDataMvc.metier.SocieteTransport;
@Transactional
public interface AerienneRepository extends JpaRepository <Aerienne, Integer>{
	
	@Modifying
	@Query ("update Cargaison p  SET p.societeTransport.idSociete = :x where idCargaison= :y")    
	public void ajouterCargaisonSociete(@Param("x")int idSociete , @Param("y")int idCargaison);

}
