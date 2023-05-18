package fr.pib.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import fr.pib.backend.beans.Developments;
import fr.pib.backend.services.DevelopmentsService;

@CrossOrigin()
@RestController
@RequestMapping("/Developements")
public class DevelopementsController {

    @Autowired
    private DevelopmentsService developmentsService;
    
    @GetMapping("")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Developments> findAll(){
        return this.developmentsService.getAllDevelopments();
    }
    
}
