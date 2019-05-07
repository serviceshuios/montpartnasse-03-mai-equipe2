package com.infotel.MavenSpringDataMvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.infotel.MavenSpringDataMvc.metier.Aerienne;
import com.infotel.MavenSpringDataMvc.service.Iservice;


@Controller
public class AerienneController {
	
	@Autowired
    private Iservice service;

	
    public Iservice getService() {
		return service;
	}

	public void setService(Iservice service) {
		this.service = service;
	}

	@RequestMapping(value = "/aerienne", method = RequestMethod.GET)
    public String lister(Model model) {
        model.addAttribute("aerienne", new Aerienne());
        model.addAttribute("aeriennes", service.findAllAeriennes());
        return "aeriennes";
    }

    @RequestMapping(value = "/saveAerienne")
    public String save(Aerienne aerienne,  Model model) {
        if (aerienne.getIdCargaison() == 0) {
            service.ajouterAerienne(aerienne);
            model.addAttribute("aerienne", new Aerienne());
            model.addAttribute("aeriennes", service.findAllAeriennes());
            return "aeriennes";
        } else {
            service.modifierAerienne(aerienne);
            model.addAttribute("aerienne", new Aerienne());
            model.addAttribute("aeriennes", service.findAllAeriennes());
            return "aeriennes";
        }
    }
    @RequestMapping(value = "/deleteAerienne")
    public String delete(@RequestParam int idCargaison, Model model) {
        service.supprimerAerienne(idCargaison);
        model.addAttribute("aerienne", new Aerienne());
        model.addAttribute("aeriennes", service.findAllAeriennes());
        return "aeriennes";
    }

    @RequestMapping(value = "/editAerienne")
    public String edit(@RequestParam int idCargaison, Model model) {
        model.addAttribute("aerienne", service.getAerienne(idCargaison));
        model.addAttribute("aeriennes", service.findAllAeriennes());
        return "aeriennes";
    }
    @RequestMapping(value = "/attribuerCarAer", method = RequestMethod.GET)    
    public String AttribCarAer(Model model) {        
    	model.addAttribute("aerienne", new Aerienne());     //crée un pauchoir avec les attributs de la classe Aerienne sur le formulaire       
    	model.addAttribute("aeriennes", service.findAllAeriennes());        //remlpi la liste des cargaisons aeriennes en jsp       
    	model.addAttribute("societes", service.findAllSocieteTransports());        //remlpi la liste des cargaisons aeriennes en jsp       
    	return "attribuerCarAer";                                    //designe la jsp    
    	}
    
    
    @RequestMapping(value = "/attribuerAerienne")
    public String AttribCarAer(@RequestParam int idSociete,@RequestParam int idCargaison, Model model) {
        service.ajouterCargaisonSociete(idSociete, idCargaison);
        model.addAttribute("aeriennes", service.findAllAeriennes());
        model.addAttribute("societes", service.findAllSocieteTransports());
        return"attribuerCarAer" ;
    }
}
