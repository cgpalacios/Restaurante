package ar.edu.undec.restaurante.dto;


import lombok.Data;

@Data
public class MenuDto {

    private int idMenu;
    private String descripcionMenu;
    private double precio;
    private int stock;
}
