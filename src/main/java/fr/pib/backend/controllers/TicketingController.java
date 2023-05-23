package fr.pib.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import fr.pib.backend.beans.Ticketing;
import fr.pib.backend.services.TicketingService;

@CrossOrigin()
@RestController
@RequestMapping("/ticketing")
public class TicketingController {

    @Autowired
    private TicketingService ticketingService;
    
    @GetMapping("")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Ticketing> findAll(){
        return this.ticketingService.getAllTicketing();
    }
}
