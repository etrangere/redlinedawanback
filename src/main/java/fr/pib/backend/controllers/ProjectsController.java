package fr.pib.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

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
    
    //create projects    
    @PostMapping("")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Projects create(@RequestBody Projects projects) {
        return this.projectsService.create(projects);
    }
    
    //update projects    
    @PutMapping("/{id}")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public Projects update(@RequestBody Projects projects, @PathVariable("id") Long id) {
        if (!id.equals(projects.getId())){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,
                    "Mauvaise session à mettre à jour");
        }
        return this.projectsService.update(projects);
    }
    
    //delete project
    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public void delete(@PathVariable Long id) {
        this.projectsService.delete(id);
    }
}
