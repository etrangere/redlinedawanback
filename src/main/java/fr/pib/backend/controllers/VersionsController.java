package fr.pib.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import fr.pib.backend.beans.Versions;
import fr.pib.backend.services.VersionsService;

@CrossOrigin()
@RestController
@RequestMapping("/versions")
public class VersionsController {


    @Autowired
    private VersionsService versionsService;
    
    @GetMapping("")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Versions> findAll(){
        return this.versionsService.getAllVersions();
    }
}
