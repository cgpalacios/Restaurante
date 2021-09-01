package ar.edu.undec.restaurante.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "item_menu", schema = "restaurante", catalog = "")
@IdClass(ItemMenuEntityPK.class)
public class ItemMenuEntity {
    private Integer idMenu;
    private int idOrden;
    private int cantidad;
    private MenuEntity menuByIdMenu;
    private OrdenEntity ordenByIdOrden;

    @Id
    @Column(name = "id_menu")
    public Integer getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(Integer idMenu) {
        this.idMenu = idMenu;
    }

    @Id
    @Column(name = "id_orden")
    public int getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

    @Basic
    @Column(name = "cantidad")
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemMenuEntity that = (ItemMenuEntity) o;
        return idMenu == that.idMenu &&
                idOrden == that.idOrden &&
                cantidad == that.cantidad;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMenu, idOrden, cantidad);
    }

    @ManyToOne
    @JoinColumn(name = "id_menu", insertable= false, updatable= false)
    public MenuEntity getMenuByIdMenu() {
        return menuByIdMenu;
    }

    public void setMenuByIdMenu(MenuEntity menuByIdMenu) {
        this.menuByIdMenu = menuByIdMenu;
    }

    @ManyToOne
    @JoinColumn(name = "id_orden", insertable= false, updatable= false)
    public OrdenEntity getOrdenByIdOrden() {
        return ordenByIdOrden;
    }

    public void setOrdenByIdOrden(OrdenEntity ordenByIdOrden) {
        this.ordenByIdOrden = ordenByIdOrden;
    }
}
