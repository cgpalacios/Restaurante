package ar.edu.undec.restaurante.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "mesa")
public class MesaEntity {
    private Integer idMesa;
    private int nroMesa;
    private int capacidad;
    private String descripcion;
    private String estado;
    private RestauranteEntity restauranteByIdRestaurante;
    private Collection<OrdenEntity> ordensByIdMesa;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mesa")
    public Integer getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(Integer idMesa) {
        this.idMesa = idMesa;
    }

    @Basic
    @Column(name = "nro_mesa")
    public int getNroMesa() {
        return nroMesa;
    }

    public void setNroMesa(int nroMesa) {
        this.nroMesa = nroMesa;
    }

    @Basic
    @Column(name = "capacidad")
    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Basic
    @Column(name = "descripcion")
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Basic
    @Column(name = "estado")
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MesaEntity that = (MesaEntity) o;
        return idMesa == that.idMesa &&
                nroMesa == that.nroMesa &&
                capacidad == that.capacidad &&
                Objects.equals(descripcion, that.descripcion) &&
                Objects.equals(estado, that.estado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMesa, nroMesa, capacidad, descripcion, estado);
    }

    @ManyToOne
    @JoinColumn(name = "id_restaurante", insertable= false, updatable= false)
    public RestauranteEntity getRestauranteByIdRestaurante() {
        return restauranteByIdRestaurante;
    }

    public void setRestauranteByIdRestaurante(RestauranteEntity restauranteByIdRestaurante) {
        this.restauranteByIdRestaurante = restauranteByIdRestaurante;
    }

    @OneToMany(mappedBy = "mesaByIdMesa")
    public Collection<OrdenEntity> getOrdensByIdMesa() {
        return ordensByIdMesa;
    }

    public void setOrdensByIdMesa(Collection<OrdenEntity> ordensByIdMesa) {
        this.ordensByIdMesa = ordensByIdMesa;
    }
}
