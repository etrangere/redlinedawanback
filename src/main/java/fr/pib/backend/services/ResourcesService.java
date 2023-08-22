package fr.pib.backend.services;

import java.util.List;
import java.util.Optional;

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
    
    // get  resource by id
    
    public Optional<Resources> getResourceById(Long id){
        return resourcesRepository.findById((long) id);
    }  
    
    
    // get all Resources by project
    
    public List<Resources> getAllResourcesByProject(Long id){
        return resourcesRepository.findByProjectsId(id);
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
    
    //delete resource
    public void delete(Long id) {
        if (!this.resourcesRepository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "Impossible de trouver le project à supprimer");
        }
        this.resourcesRepository.deleteById(id);
        if (this.resourcesRepository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.EXPECTATION_FAILED,
                    "Erreur lors de la suppression de project");
        }
    }
}
