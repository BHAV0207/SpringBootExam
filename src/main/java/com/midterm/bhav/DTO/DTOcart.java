package com.midterm.bhav.DTO;
import java.util.Date;

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
    private Date date;
    private product[] products;
}