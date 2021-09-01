package ar.edu.undec.restaurante.dto;


import ar.edu.undec.restaurante.model.ClienteEntity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class ClienteDto {

    private int idCliente;
    private String nombre;
    private String apellido;
    private String email;
    private Date fechaNacimiento;
    private String direccion;
    private String celular;


    public List<ClienteDto> getClientes(List<ClienteEntity> clienteEntityList){

        List<ClienteDto> clienteDtos= new ArrayList<>();
        for(ClienteEntity i : clienteEntityList){
            ClienteDto clienteDto = new ClienteDto();
            clienteDto.setIdCliente(i.getIdCliente());
            clienteDto.setNombre(i.getNombre());
            clienteDto.setApellido(i.getApellido());
            clienteDto.setEmail(i.getEmail());
            clienteDto.setFechaNacimiento(i.getFechaNacimiento());
            clienteDto.setDireccion(i.getDireccion());
            clienteDto.setCelular(i.getCelular());
            clienteDtos.add(clienteDto);
        }
        return clienteDtos;
    }

    public ClienteDto(){

    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
}
