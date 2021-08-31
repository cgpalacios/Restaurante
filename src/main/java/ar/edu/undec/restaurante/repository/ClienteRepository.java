package ar.edu.undec.restaurante.repository;

import ar.edu.undec.restaurante.model.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ClienteRepository extends JpaRepository<Integer, ClienteEntity> {
}
