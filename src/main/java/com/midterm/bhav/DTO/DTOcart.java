package com.midterm.bhav.DTO;

import lombok.Getter;
import lombok.Setter;

/**
 * DTOcart
 */
@Setter
@Getter
public class DTOcart {
    private int id;
    private int userId;
    private String date;
    private product[] products;
}