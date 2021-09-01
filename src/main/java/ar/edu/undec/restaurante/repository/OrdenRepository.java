package ar.edu.undec.restaurante.repository;

import ar.edu.undec.restaurante.model.OrdenEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdenRepository extends JpaRepository<OrdenEntity, Integer> {
}
