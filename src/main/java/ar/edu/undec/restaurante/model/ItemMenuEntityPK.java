package ar.edu.undec.restaurante.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class ItemMenuEntityPK implements Serializable {
    private Integer idMenu;
    private Integer idOrden;

    @Column(name = "id_menu")
    @Id
    public Integer getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(Integer idMenu) {
        this.idMenu = idMenu;
    }

    @Column(name = "id_orden")
    @Id
    public Integer getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(Integer idOrden) {
        this.idOrden = idOrden;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemMenuEntityPK that = (ItemMenuEntityPK) o;
        return idMenu == that.idMenu &&
                idOrden == that.idOrden;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMenu, idOrden);
    }
}
