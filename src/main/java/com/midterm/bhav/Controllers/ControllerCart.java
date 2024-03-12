package com.midterm.bhav.Controllers;

import org.springframework.web.bind.annotation.RestController;

import com.midterm.bhav.DTO.DTOcart;
import com.midterm.bhav.Services.ServiceCart;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;




/**
 * ControllerProduct
 */
@RestController
public class ControllerCart {

    ServiceCart sc;
    ControllerCart(ServiceCart sc){
        this.sc = sc;
    }


    @GetMapping("/carts")
    public DTOcart[] getAllCart(){
        return sc.getAllCart();
    }


    @GetMapping("/carts/{id}")
    public DTOcart getCartById(@PathVariable int id){
        return sc.getCartById(id);
    }

    @GetMapping("/carts/user/{userId}")
    public DTOcart[] getCartByUserId(@PathVariable int userId){
        return sc.getCartByUserId(userId);
    }

    @PostMapping("/carts")
    public DTOcart addNewCart(@RequestBody DTOcart newCart){
        return sc.addNewCart(newCart);
    }

    @PutMapping("carts/{id}")
    public DTOcart updateCart(@RequestBody DTOcart upadateCart , @PathVariable int id){
        return sc.updateCart(upadateCart, id);

    }
    
    @DeleteMapping("carts/{id}")
    public DTOcart delCart(@PathVariable int id){
        return sc.delCart(id);
    }

     @GetMapping("/carts/date")
    public DTOcart[] getByDate(@PathVariable("start") String start, @PathVariable("end") String end){
        return sc.getByDate(start, end);
    }
    

    
  
    
    
    
    
}