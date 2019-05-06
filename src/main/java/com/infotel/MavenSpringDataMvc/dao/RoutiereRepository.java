package com.infotel.MavenSpringDataMvc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infotel.MavenSpringDataMvc.metier.Cargaison;

public interface RoutiereRepository extends JpaRepository <Cargaison, Integer>{

}
