package ar.edu.undec.restaurante.repository;

import ar.edu.undec.restaurante.model.FacturaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaRepository extends JpaRepository<FacturaEntity, Integer> {
}
