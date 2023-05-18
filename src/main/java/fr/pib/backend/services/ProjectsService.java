package fr.pib.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
}
