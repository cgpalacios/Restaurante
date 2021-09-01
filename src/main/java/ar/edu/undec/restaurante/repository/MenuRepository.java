package ar.edu.undec.restaurante.repository;

import ar.edu.undec.restaurante.model.MenuEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<MenuEntity, Integer> {
}
