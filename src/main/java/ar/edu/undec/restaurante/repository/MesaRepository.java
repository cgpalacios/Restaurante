package ar.edu.undec.restaurante.repository;

import ar.edu.undec.restaurante.model.MesaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MesaRepository extends JpaRepository<MesaEntity, Integer> {
}
