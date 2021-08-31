package ar.edu.undec.restaurante.dto;


import lombok.Data;

import java.util.Date;
@Data
public class ClienteDto {

    private int idCliente;
    private String nombre;
    private String apellido;
    private String email;
    private Date fechaNacimiento;
    private String direccion;
    private String celular;

}
