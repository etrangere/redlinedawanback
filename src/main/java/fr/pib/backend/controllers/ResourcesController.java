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
import fr.pib.backend.beans.Resources;
import fr.pib.backend.services.ResourcesService;


@CrossOrigin()
@RestController
@RequestMapping("/resources")
public class ResourcesController {

    @Autowired
    private ResourcesService resourcesService;
    
    @GetMapping("")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Resources> findAll(){
        return this.resourcesService.getAllResources();
    }
    
    //create resources    
    @PostMapping("")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Resources create(@RequestBody Resources resources) {
        System.out.println(resources);
        return this.resourcesService.create(resources);
    }
    /*
    //create resources  with validation  
    @PostMapping("")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Resources create(@Valid @RequestBody Resources resources,BindingResult rsource) {
        if(rsource.hasErrors()) {
            System.out.println("error");
        }
        return this.resourcesService.create(resources);
    }
    */
    
    
    //update resources    
    @PutMapping("/{id}")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public Resources update(@RequestBody Resources resources, @PathVariable("id") Long id) {
        if (!id.equals(resources.getId())){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,
                    "Mauvaise session à mettre à jour");
        }
        return this.resourcesService.update(resources);
    }
    
    //delete resources
    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public void delete(@PathVariable Long id) {
        this.resourcesService.delete(id);
    }
}
