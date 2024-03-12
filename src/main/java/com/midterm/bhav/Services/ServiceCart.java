package com.midterm.bhav.Services;




import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.midterm.bhav.DTO.DTOcart;

@Service
public class ServiceCart {
    RestTemplate restTemplate = new RestTemplate();
    String url = "https://fakestoreapi.com";


    public DTOcart[] getAllCart(){
        var response = restTemplate.getForObject(url + "/carts", DTOcart[].class);
        return response;
    }

    public DTOcart getCartById(int id){
        var response = restTemplate.getForObject(url + "/carts/" + id, DTOcart.class);
        return response;
    }

    public DTOcart[] getCartByUserId(int userId){
        var response = restTemplate.getForObject(url +"/carts/user/" + userId, DTOcart[].class);
        return response;
    }

    public DTOcart addNewCart(DTOcart newCart){
        var response = restTemplate.postForObject(url + "/carts", newCart , DTOcart.class);
        return response;
    }

    public DTOcart updateCart(DTOcart upadateCart ,int id){
        var response = restTemplate.exchange(url + "/carts/" + id , HttpMethod.PUT ,new HttpEntity<DTOcart>(upadateCart), DTOcart.class);
        return response.getBody();
    }

    public DTOcart delCart(int id){
        var response = restTemplate.exchange(url + "/carts/" + id ,HttpMethod.DELETE ,  null ,DTOcart.class);
        return response.getBody();
    }

     public DTOcart[] getByDate(String start, String end) {
        var response = restTemplate.getForObject(url + "?startdate=" + start + "&enddate=" + end, DTOcart[].class);
     
        return response;
    }
}
