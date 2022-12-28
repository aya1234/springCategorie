package tn.uma.isamm.categorie.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.uma.isamm.categorie.entities.Categorie;
import tn.uma.isamm.categorie.services.ICategorie;

@RestController("")
public class CategorieController {
	
@Autowired
ICategorie categorieservice;

@PostMapping("/add-categorie")
@ResponseBody
Categorie  addCategorie(@RequestBody Categorie c ){
	return categorieservice.addCategorie(c);
}


@GetMapping("/find-categorie")
@ResponseBody
List<Categorie> findAllCategories(){
    return categorieservice.findAllCategories();
}

@PutMapping("/modify-categorie/{idcat}")
@ResponseBody
   void updateCategorie(@RequestBody Categorie c,@PathVariable(name="idcat" )long idcat){
	categorieservice.updateCategorie(c,idcat);
}

@DeleteMapping("/delete-categorie/{id}")
void deleteClient(@PathVariable(name="id")Long idCategorie){
	categorieservice.removeCategorie(idCategorie);
}


}
