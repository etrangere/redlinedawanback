package fr.pib.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.pib.backend.beans.Resources;
import fr.pib.backend.repositories.ResourcesRepository;

@Service
public class ResourcesService {

    
    @Autowired
    private ResourcesRepository resourcesRepository;
    
    // get all Resources
    
    public List<Resources> getAllResources(){
        return resourcesRepository.findAll();
    }  
}
