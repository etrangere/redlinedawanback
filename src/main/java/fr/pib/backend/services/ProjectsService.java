package fr.pib.backend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import fr.pib.backend.beans.Projects;
import fr.pib.backend.repositories.ProjectsRepository;


@Service
public class ProjectsService {

    @Autowired
    private ProjectsRepository projectsRepository;
    
    // get all Projects
    
    public List<Projects> getAllProjects(){
        return projectsRepository.findAll();
    }  
    
    // get project by id
    public Optional<Projects> getProjectById(Long id){
        return projectsRepository.findById(id);
    }  
    //create projects
    public Projects create(Projects projects) {
        return this.projectsRepository.save(projects);
    }
    
    //update projects
    public Projects update(Projects projects) {
        if (!this.projectsRepository.existsById(projects.getId())) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "Impossible de trouver le projet à mettre à jour");
        }
        return this.projectsRepository.save(projects);
    }
    
    //delete project
    public void delete(Long id) {
        if (!this.projectsRepository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "Impossible de trouver le project à supprimer");
        }
        this.projectsRepository.deleteById(id);
        if (this.projectsRepository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.EXPECTATION_FAILED,
                    "Erreur lors de la suppression de project");
        }
    }
}
