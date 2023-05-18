package fr.pib.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import fr.pib.backend.beans.Developments;
import fr.pib.backend.repositories.DevelopmentsRepository;

@Service
public class DevelopmentsService {

    @Autowired
    private DevelopmentsRepository developmentsRepository;
    
 // get all developements
    
    public List<Developments> getAllDevelopments(){
        return developmentsRepository.findAll();
    }       
    
}
