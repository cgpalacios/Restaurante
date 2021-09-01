package ar.edu.undec.restaurante.services;


import ar.edu.undec.restaurante.dto.ClienteDto;
import ar.edu.undec.restaurante.model.ClienteEntity;
import ar.edu.undec.restaurante.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService  {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<ClienteDto> getClientes(){
        List<ClienteEntity> clienteEntities = clienteRepository.findAll();
        List<ClienteDto> clienteDtos = new ClienteDto().getClientes(clienteEntities);
        return clienteDtos;
    }

}
