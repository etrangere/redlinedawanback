package fr.pib.backend.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.pib.backend.beans.Time_lines;
import fr.pib.backend.repositories.TimeLinesRepository;

@Service
public class Time_linesService {

    @Autowired
    private TimeLinesRepository time_linesRepository;
    
    // get all Time_lines
    
    public List<Time_lines> getAllTime_lines(){
        return time_linesRepository.findAll();
    }  
}
