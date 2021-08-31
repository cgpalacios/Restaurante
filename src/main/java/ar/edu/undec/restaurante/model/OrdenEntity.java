package ar.edu.undec.restaurante.model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "orden")
public class OrdenEntity {
    private Integer idOrden;
    private String estado;
    private Date fechaReservacion;
    private Time horaReservacion;
    private Collection<FacturaEntity> facturasByIdOrden;
    private Collection<ItemMenuEntity> itemMenusByIdOrden;
    private ClienteEntity clienteByIdCliente;
    private MesaEntity mesaByIdMesa;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_orden")
    public Integer getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(Integer idOrden) {
        this.idOrden = idOrden;
    }

    @Basic
    @Column(name = "estado")
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Basic
    @Column(name = "fecha_reservacion")
    public Date getFechaReservacion() {
        return fechaReservacion;
    }

    public void setFechaReservacion(Date fechaReservacion) {
        this.fechaReservacion = fechaReservacion;
    }

    @Basic
    @Column(name = "hora_reservacion")
    public Time getHoraReservacion() {
        return horaReservacion;
    }

    public void setHoraReservacion(Time horaReservacion) {
        this.horaReservacion = horaReservacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrdenEntity that = (OrdenEntity) o;
        return idOrden == that.idOrden &&
                Objects.equals(estado, that.estado) &&
                Objects.equals(fechaReservacion, that.fechaReservacion) &&
                Objects.equals(horaReservacion, that.horaReservacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idOrden, estado, fechaReservacion, horaReservacion);
    }

    @OneToMany(mappedBy = "ordenByIdOrden")
    public Collection<FacturaEntity> getFacturasByIdOrden() {
        return facturasByIdOrden;
    }

    public void setFacturasByIdOrden(Collection<FacturaEntity> facturasByIdOrden) {
        this.facturasByIdOrden = facturasByIdOrden;
    }

    @OneToMany(mappedBy = "ordenByIdOrden")
    public Collection<ItemMenuEntity> getItemMenusByIdOrden() {
        return itemMenusByIdOrden;
    }

    public void setItemMenusByIdOrden(Collection<ItemMenuEntity> itemMenusByIdOrden) {
        this.itemMenusByIdOrden = itemMenusByIdOrden;
    }

    @ManyToOne
    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente", nullable = false)
    public ClienteEntity getClienteByIdCliente() {
        return clienteByIdCliente;
    }

    public void setClienteByIdCliente(ClienteEntity clienteByIdCliente) {
        this.clienteByIdCliente = clienteByIdCliente;
    }

    @ManyToOne
    @JoinColumn(name = "id_mesa", referencedColumnName = "id_mesa", nullable = false)
    public MesaEntity getMesaByIdMesa() {
        return mesaByIdMesa;
    }

    public void setMesaByIdMesa(MesaEntity mesaByIdMesa) {
        this.mesaByIdMesa = mesaByIdMesa;
    }
}
