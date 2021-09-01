package ar.edu.undec.restaurante.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "factura")
public class FacturaEntity {
    private Integer idFactura;
    private String formaPago;
    private double precio;
    private String estado;
    private OrdenEntity ordenByIdOrden;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_factura")
    public Integer getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Integer idFactura) {
        this.idFactura = idFactura;
    }

    @Basic
    @Column(name = "forma_pago")
    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    @Basic
    @Column(name = "precio")
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
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
        FacturaEntity that = (FacturaEntity) o;
        return idFactura == that.idFactura &&
                Double.compare(that.precio, precio) == 0 &&
                Objects.equals(formaPago, that.formaPago) &&
                Objects.equals(estado, that.estado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idFactura, formaPago, precio, estado);
    }

    @ManyToOne
    @JoinColumn(name = "id_orden",insertable= false, updatable= false)
    public OrdenEntity getOrdenByIdOrden() {
        return ordenByIdOrden;
    }

    public void setOrdenByIdOrden(OrdenEntity ordenByIdOrden) {
        this.ordenByIdOrden = ordenByIdOrden;
    }
}
