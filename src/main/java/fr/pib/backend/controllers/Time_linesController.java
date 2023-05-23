package fr.pib.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import fr.pib.backend.beans.Time_lines;
import fr.pib.backend.services.Time_linesService;

@CrossOrigin()
@RestController
@RequestMapping("/timelines")
public class Time_linesController {

    @Autowired
    private Time_linesService time_linesService;
    
    @GetMapping("")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Time_lines> findAll(){
        return this.time_linesService.getAllTime_lines();
    }
}
