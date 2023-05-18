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
import fr.pib.backend.services.Languages_and_technosService;

@CrossOrigin()
@RestController
@RequestMapping("/Languages_and_technos")
public class Languages_and_technosController {

    @Autowired
    private Languages_and_technosService languages_and_technosService;
    
    @GetMapping("")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Languages_and_technosService> findAll(){
        return this.languages_and_technosService.getAlllanguages_and_technosService();
    }
}
