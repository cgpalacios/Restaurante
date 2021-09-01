package ar.edu.undec.restaurante.dto;



import java.sql.Time;
import java.util.Date;

public class OrdenDto {

    private int idOrden;
    private ClienteDto clienteDto;
    private MesaDto mesaDto;
    private String estado;
    private Date fechaReservacion;
    private Time horaReservacion;


}
