package fr.pib.backend.services;

import java.util.List;

import fr.pib.backend.beans.Developments;
import fr.pib.backend.beans.Languages_and_technos;
import fr.pib.backend.repositories.Languages_and_technosRepository;

public class Languages_and_technosService {

// get all languages_and_technos
    
    public List<Languages_and_technos> getAllLanguages_and_technos(){
        return Languages_and_technosRepository.findAll();
    }  
    
}
