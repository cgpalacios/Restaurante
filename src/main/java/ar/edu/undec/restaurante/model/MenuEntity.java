package ar.edu.undec.restaurante.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "menu")
public class MenuEntity {
    private Integer idMenu;
    private String descripcionMenu;
    private double precio;
    private int stock;
    private Collection<ItemMenuEntity> itemMenusByIdMenu;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_menu")
    public Integer getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(Integer idMenu) {
        this.idMenu = idMenu;
    }

    @Basic
    @Column(name = "descripcion_menu")
    public String getDescripcionMenu() {
        return descripcionMenu;
    }

    public void setDescripcionMenu(String descripcionMenu) {
        this.descripcionMenu = descripcionMenu;
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
    @Column(name = "stock")
    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuEntity that = (MenuEntity) o;
        return idMenu == that.idMenu &&
                Double.compare(that.precio, precio) == 0 &&
                stock == that.stock &&
                Objects.equals(descripcionMenu, that.descripcionMenu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMenu, descripcionMenu, precio, stock);
    }

    @OneToMany(mappedBy = "menuByIdMenu")
    public Collection<ItemMenuEntity> getItemMenusByIdMenu() {
        return itemMenusByIdMenu;
    }

    public void setItemMenusByIdMenu(Collection<ItemMenuEntity> itemMenusByIdMenu) {
        this.itemMenusByIdMenu = itemMenusByIdMenu;
    }
}
