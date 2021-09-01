package ar.edu.undec.restaurante.repository;

import ar.edu.undec.restaurante.model.ItemMenuEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemMenuRepository extends JpaRepository<ItemMenuEntity, Integer> {
}
