package fr.pib.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.pib.backend.beans.Languages_and_technos;
import fr.pib.backend.repositories.Languages_and_technosRepository;

@Service
public class Languages_and_technosService {

    
    @Autowired
    private Languages_and_technosRepository languages_and_technosRepository;
    
   // get all languages_and_technos
    
    public List<Languages_and_technos> getAllLanguages_and_technos(){
        return languages_and_technosRepository.findAll();
    }  
    
}
