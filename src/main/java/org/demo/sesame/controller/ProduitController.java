package org.demo.sesame.controller;

import java.util.List;


import org.demo.sesame.entities.Produit;
import org.demo.sesame.metier.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Component
@ConfigurationProperties
@RestController
public class ProduitController {
	@Value("${application.message}")
	String message ;
	@Value("${application.appname}")
	String appname ;
	@Autowired
	private ProduitRepository produitRepository ;
	@RequestMapping("/")
	String home() {
		return "Hello world ... " +message+ "" +appname ;
	}
	@RequestMapping(value="/SaveProduit")
	public Produit create(@RequestBody Produit produit) {
		return produitRepository.save(produit);
	}
	@RequestMapping(value="/produitByid")
	public Produit get (@PathVariable Long id) {
		return produitRepository.findById(id).get();
	}

	

}
