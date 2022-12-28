package tn.uma.isamm.categorie.services;

import java.util.*;

import org.springframework.data.domain.Page;

import tn.uma.isamm.categorie.entities.Categorie;

public interface ICategorie {
	List<Categorie> findAllCategories();

    Categorie addCategorie(Categorie c);

    Categorie updateCategorie(Categorie c,long idcat);
    
    Categorie findCategorie(Long id);

    void removeCategorie(Long id);

}
