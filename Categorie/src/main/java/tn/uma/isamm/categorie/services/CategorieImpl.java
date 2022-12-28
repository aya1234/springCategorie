package tn.uma.isamm.categorie.services;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import tn.uma.isamm.categorie.entities.Categorie;
import tn.uma.isamm.categorie.repositories.CategorieRepository;

@Service
public class CategorieImpl implements ICategorie{
	
	@Autowired
	CategorieRepository categorieRepository;
	
	@Override
	public List<Categorie> findAllCategories() {
		// TODO Auto-generated method stub
		return categorieRepository.findAll();
	}

	@Override
	public Categorie addCategorie(Categorie c) {
		// TODO Auto-generated method stub
		try {
            return categorieRepository.save(c);
        } catch (Exception E) {
            System.out.println("Erreur  : " + E);
        }
        return c;
	}

	@Override
	public Categorie updateCategorie(Categorie c, long idcat) {
		// TODO Auto-generated method stub
            Categorie cat=categorieRepository.findById(idcat).orElse(null);
            cat.setDesignation(c.getDesignation());
            return categorieRepository.save(cat);
       
	}

	@Override
	public Categorie findCategorie(Long id) {
		// TODO Auto-generated method stub
		try {
            return categorieRepository.findById(id).get();
        } catch (Exception E) {
            System.out.println("Erreur : " + E);
        }
		return null;
		
	}

	@Override
	public void removeCategorie(Long id) {
		// TODO Auto-generated method stub
		try {
            Categorie categorieProduit=categorieRepository.findById(id).orElseThrow(ChangeSetPersister.NotFoundException::new);
            categorieRepository.delete(categorieProduit);
        } catch (Exception err) {
            System.out.println("Erreur : " + err);
        }
		
	}


}
