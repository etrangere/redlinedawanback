package fr.pib.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.pib.backend.beans.Versions;
import fr.pib.backend.repositories.VersionsRepository;

@Service
public class VersionsService {

    @Autowired
    private VersionsRepository versionsRepository;
    
    // get all Versions
    
    public List<Versions> getAllVersions(){
        return versionsRepository.findAll();
    }  
}
