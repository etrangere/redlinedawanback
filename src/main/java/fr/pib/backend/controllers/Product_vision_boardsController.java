package fr.pib.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import fr.pib.backend.beans.Product_vision_boards;
import fr.pib.backend.services.Product_vision_boardsService;

@CrossOrigin()
@RestController
@RequestMapping("/product_vision_boards")
public class Product_vision_boardsController {

    
    @Autowired
    private Product_vision_boardsService product_vision_boards;
    
    @GetMapping("")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Product_vision_boards> findAll(){
        return this.product_vision_boards.getAllProduct_vision_boards();
    }
}
