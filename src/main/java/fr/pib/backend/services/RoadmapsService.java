package fr.pib.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.pib.backend.beans.Roadmaps;
import fr.pib.backend.repositories.RoadmapsRepository;

@Service
public class RoadmapsService {

    @Autowired
    private RoadmapsRepository roadmapsRepository;
    
    // get all Roadmaps
    
    public List<Roadmaps> getAllRoadmaps(){
        return roadmapsRepository.findAll();
    }   
}
