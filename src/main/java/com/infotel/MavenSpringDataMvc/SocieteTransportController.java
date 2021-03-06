package com.infotel.MavenSpringDataMvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.infotel.MavenSpringDataMvc.metier.SocieteTransport;
import com.infotel.MavenSpringDataMvc.service.Iservice;
@Controller
public class SocieteTransportController {
	
	@Autowired
    private Iservice service;

    @RequestMapping(value = "/societe", method = RequestMethod.GET)
    public String lister(Model model) {
        model.addAttribute("societe", new SocieteTransport());
        model.addAttribute("societes", service.findAllSocieteTransports());
        return "societes";
    }

    @RequestMapping(value = "/saveSocieteTransport")
    public String save(SocieteTransport societe,  Model model) {
        if (societe.getIdSociete() == 0) {
            service.ajouterSocieteTransport(societe);
            model.addAttribute("societe", new SocieteTransport());
            model.addAttribute("societes", service.findAllSocieteTransports());
            return "societes";
        } else {
            service.modifierSocieteTransport(societe);
            model.addAttribute("societe", new SocieteTransport());
            model.addAttribute("societes", service.findAllSocieteTransports());
            return "societes";
        }
    }
    @RequestMapping(value = "/deleteSocieteTransport")
    public String delete(@RequestParam int idSociete, Model model) {
        service.supprimerSocieteTransport(idSociete);
        model.addAttribute("societe", new SocieteTransport());
        model.addAttribute("societes", service.findAllSocieteTransports());
        return "societes";
    }

    @RequestMapping(value = "/editSocieteTransport")
    public String edit(@RequestParam int idSociete, Model model) {
        model.addAttribute("societe", service.getSocieteTransport(idSociete));
        model.addAttribute("societes", service.findAllSocieteTransports());
        return "societes";
    }

}
