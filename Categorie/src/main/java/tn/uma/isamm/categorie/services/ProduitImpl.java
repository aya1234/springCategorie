package tn.uma.isamm.categorie.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.uma.isamm.categorie.entities.Categorie;
import tn.uma.isamm.categorie.entities.Produit;
import tn.uma.isamm.categorie.repositories.ProduitRepository;

@Service
public class ProduitImpl implements IProduit{
	
	@Autowired
	ProduitRepository produitRepository;

	@Override
	public List<Produit> findAllProduits() {
		// TODO Auto-generated method stub
		return produitRepository.findAll();
	}

	@Override
	public Produit addProduit(Produit p) {
		// TODO Auto-generated method stub
		return produitRepository.save(p);
	}

	@Override
	public Produit updateProduit(Produit p, long idprod) {
		// TODO Auto-generated method stub
		Produit prod=produitRepository.findById(idprod).orElse(null);
		prod.setCategorie(p.getCategorie());
        return produitRepository.save(prod);
	}

	@Override
	public Produit findProduit(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeProduit(Long id) {
		// TODO Auto-generated method stub
		
	}

}
