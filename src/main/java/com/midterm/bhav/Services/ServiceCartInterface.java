package com.midterm.bhav.Services;



import com.midterm.bhav.DTO.DTOcart;

public interface ServiceCartInterface {
    public DTOcart[] getAllCart();

    public DTOcart getCartById(int id);

    public DTOcart[] getCartByUserId(int userId);

    public DTOcart addNewCart(DTOcart newCart);

    public DTOcart updateCart(DTOcart upadateCart , int id);

    public DTOcart delCart(int id);

   // public DTOcart[] getByDate(String Sdate);
}
