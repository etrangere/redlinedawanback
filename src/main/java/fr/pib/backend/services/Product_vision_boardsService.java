package fr.pib.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.pib.backend.beans.Product_vision_boards;
import fr.pib.backend.repositories.Product_vision_boardsRepository;



@Service
public class Product_vision_boardsService {

    @Autowired
    private Product_vision_boardsRepository product_vision_boardsRepository;
    
// get all Product_vision_boards
    
    public List<Product_vision_boards> getAllProduct_vision_boards(){
        return product_vision_boardsRepository.findAll();
    }  
}
