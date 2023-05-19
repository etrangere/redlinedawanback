package fr.pib.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import fr.pib.backend.beans.Projects;
import fr.pib.backend.services.ProjectsService;

@CrossOrigin()
@RestController
@RequestMapping("/projects")
public class ProjectsController {

    @Autowired
    private ProjectsService projectsService;
    
    @GetMapping("")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Projects> findAll(){
        return this.projectsService.getAllProjects();
    }
}
