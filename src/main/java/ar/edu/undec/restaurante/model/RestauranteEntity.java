package ar.edu.undec.restaurante.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "restaurante")
public class RestauranteEntity {
    private Integer idRestaurante;
    private String nombre;
    private String direccion;
    private String email;
    private String telefono;
    private Collection<MesaEntity> mesasByIdRestaurante;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_restaurante")
    public Integer getIdRestaurante() {
        return idRestaurante;
    }

    public void setIdRestaurante(Integer idRestaurante) {
        this.idRestaurante = idRestaurante;
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
    @Column(name = "direccion")
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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
    @Column(name = "telefono")
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RestauranteEntity that = (RestauranteEntity) o;
        return idRestaurante == that.idRestaurante &&
                Objects.equals(nombre, that.nombre) &&
                Objects.equals(direccion, that.direccion) &&
                Objects.equals(email, that.email) &&
                Objects.equals(telefono, that.telefono);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idRestaurante, nombre, direccion, email, telefono);
    }

    @OneToMany(mappedBy = "restauranteByIdRestaurante")
    public Collection<MesaEntity> getMesasByIdRestaurante() {
        return mesasByIdRestaurante;
    }

    public void setMesasByIdRestaurante(Collection<MesaEntity> mesasByIdRestaurante) {
        this.mesasByIdRestaurante = mesasByIdRestaurante;
    }
}
