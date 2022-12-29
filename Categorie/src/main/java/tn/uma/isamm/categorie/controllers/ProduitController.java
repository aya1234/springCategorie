package tn.uma.isamm.categorie.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.uma.isamm.categorie.entities.Produit;
import tn.uma.isamm.categorie.services.IProduit;

@RestController("")
public class ProduitController {

	@Autowired
	IProduit produitservice;
	
	@PostMapping("/add-produit")
	@ResponseBody
	Produit  addProduit(@RequestBody Produit p ){
		return produitservice.addProduit(p);
	}
	
	@PutMapping("/modify-produit/{idprod}")
	@ResponseBody
	   void updateProduit(@RequestBody Produit p,@PathVariable(name="idprod" )long idprod){
		produitservice.updateProduit(p,idprod);
	}
}
