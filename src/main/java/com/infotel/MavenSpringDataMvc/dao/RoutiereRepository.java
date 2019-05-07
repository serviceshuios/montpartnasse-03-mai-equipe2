package com.infotel.MavenSpringDataMvc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.infotel.MavenSpringDataMvc.metier.Routiere;
@Transactional
public interface RoutiereRepository extends JpaRepository <Routiere, Integer>{
	
	@Modifying
	@Query ("update Cargaison p  SET p.societeTransport.idSociete = :x where idCargaison= :y")    
	public void ajouterCargaisonRoutiereSociete(@Param("x")int idSociete , @Param("y")int idCargaison);

}
