package com.infotel.MavenSpringDataMvc.metier;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity
@Scope (value = "prototype")  
@Component
public class SocieteTransport {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idSociete;
	private int nomSociete;
	private String numSiret;
	private Date dateCreation;
	
	@OneToMany (mappedBy= "societeTransport")
	private  List<Cargaison> cargaisons;
}
