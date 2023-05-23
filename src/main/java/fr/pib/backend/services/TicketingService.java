package fr.pib.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.pib.backend.beans.Ticketing;
import fr.pib.backend.repositories.TicketingRepository;

@Service
public class TicketingService {

    
    @Autowired
    private TicketingRepository ticketingRepository;
    
    // get all Ticketing
    
    public List<Ticketing> getAllTicketing(){
        return ticketingRepository.findAll();
    }  
}
