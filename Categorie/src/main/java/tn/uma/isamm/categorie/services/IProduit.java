package tn.uma.isamm.categorie.services;

import java.util.List;

import tn.uma.isamm.categorie.entities.Produit;

public interface IProduit {
	List<Produit> findAllProduits();

	Produit addProduit(Produit p);

	Produit updateProduit(Produit p,long idprod);
    
	Produit findProduit(Long id);

    void removeProduit(Long id);
}
