package ar.edu.undec.restaurante.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "cliente")
public class ClienteEntity {
    private Integer idCliente;
    private String nombre;
    private String apellido;
    private String email;
    private Date fechaNacimiento;
    private String direccion;
    private String celular;
    private Collection<OrdenEntity> ordensByIdCliente;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    @Basic
    @Column(name = "nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "apellido")
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "fecha_nacimiento")
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Basic
    @Column(name = "direccion")
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Basic
    @Column(name = "celular")
    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClienteEntity that = (ClienteEntity) o;
        return idCliente == that.idCliente &&
                Objects.equals(nombre, that.nombre) &&
                Objects.equals(apellido, that.apellido) &&
                Objects.equals(email, that.email) &&
                Objects.equals(fechaNacimiento, that.fechaNacimiento) &&
                Objects.equals(direccion, that.direccion) &&
                Objects.equals(celular, that.celular);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCliente, nombre, apellido, email, fechaNacimiento, direccion, celular);
    }

    @OneToMany(mappedBy = "clienteByIdCliente")
    public Collection<OrdenEntity> getOrdensByIdCliente() {
        return ordensByIdCliente;
    }

    public void setOrdensByIdCliente(Collection<OrdenEntity> ordensByIdCliente) {
        this.ordensByIdCliente = ordensByIdCliente;
    }
}
