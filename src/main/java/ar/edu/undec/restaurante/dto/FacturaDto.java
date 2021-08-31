package ar.edu.undec.restaurante.dto;

import lombok.Data;

@Data
public class FacturaDto {

    private int idFactura;
    private OrdenDto ordenDto;
    private String formaPago;
    private double precio;
    private String estado;
}
