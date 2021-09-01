package ar.edu.undec.restaurante.repository;

import ar.edu.undec.restaurante.model.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<ClienteEntity, Integer> {

}
