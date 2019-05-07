package com.infotel.MavenSpringDataMvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.infotel.MavenSpringDataMvc.metier.Aerienne;
import com.infotel.MavenSpringDataMvc.metier.Routiere;
import com.infotel.MavenSpringDataMvc.service.Iservice;

@Controller
public class RoutiereController {
	@Autowired
    private Iservice service;

    @RequestMapping(value = "/routiere", method = RequestMethod.GET)
    public String lister(Model model) {
        model.addAttribute("routiere", new Routiere());
        model.addAttribute("routieres", service.findAllRoutieres());
        return "routieres";
    }

    @RequestMapping(value = "/saveRoutiere")
    public String save(Routiere routiere,  Model model) {
        if (routiere.getIdCargaison() == 0) {
            service.ajouterRoutiere(routiere);
            model.addAttribute("routiere", new Routiere());
            model.addAttribute("routieres", service.findAllRoutieres());
            return "routieres";
        } else {
            service.modifierRoutiere(routiere);
            model.addAttribute("routiere", new Routiere());
            model.addAttribute("routieres", service.findAllRoutieres());
            return "routieres";
        }
    }
    @RequestMapping(value = "/deleteRoutiere")
    public String delete(@RequestParam int idCargaison, Model model) {
        service.supprimerRoutiere(idCargaison);
        model.addAttribute("routiere", new Routiere());
        model.addAttribute("routieres", service.findAllRoutieres());
        return "routieres";
    }

    @RequestMapping(value = "/editRoutiere")
    public String edit(@RequestParam int idCargaison, Model model) {
        model.addAttribute("routiere", service.getRoutiere(idCargaison));
        model.addAttribute("routieres", service.findAllRoutieres());
        return "routieres";
    }
    @RequestMapping(value = "/attribuerCarRout", method = RequestMethod.GET)    
    public String AttribCarRout(Model model) {        
    	model.addAttribute("routiere", new Routiere());     //crée un pauchoir avec les attributs de la classe Aerienne sur le formulaire       
    	model.addAttribute("routieres", service.findAllRoutieres());        //remlpi la liste des cargaisons aeriennes en jsp       
    	model.addAttribute("societes", service.findAllSocieteTransports());        //remlpi la liste des cargaisons aeriennes en jsp       
    	return "attribuerCarRout";                                    //designe la jsp    
    	}
    
    
    @RequestMapping(value = "/attribuerRoutiere")
    public String AttribCarRout(@RequestParam int idSociete,@RequestParam int idCargaison, Model model) {
        service.ajouterCargaisonSociete(idSociete, idCargaison);
        model.addAttribute("routieres", service.findAllRoutieres());
        model.addAttribute("societes", service.findAllSocieteTransports());
        return"attribuerCarRout" ;
    }

}



