package ar.edu.undec.restaurante.dto;


import lombok.Data;

@Data
public class MesaDto {

    private int idMesa;
    private int nroMesa;
    private int capacidad;
    private String descripcion;
    private String estado;
    private RestauranteDto restauranteDto;

}
