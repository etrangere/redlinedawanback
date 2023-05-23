package fr.pib.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;


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
    
    //create Resources
    public Resources create(Resources resources) {
        return this.resourcesRepository.save(resources);
    }
    
    //update Resources
    public Resources update(Resources resources) {
        if (!this.resourcesRepository.existsById(resources.getId())) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "Impossible de trouver le resource à mettre à jour");
        }
        return this.resourcesRepository.save(resources);
    }
}
