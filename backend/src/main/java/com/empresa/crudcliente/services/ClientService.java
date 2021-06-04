package com.empresa.crudcliente.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.empresa.crudcliente.dto.ClientDTO;
import com.empresa.crudcliente.entities.Client;
import com.empresa.crudcliente.repositories.ClientRepository;
import com.empresa.crudcliente.services.exceptions.ResourceNotFoundException;

@Service
public class ClientService {

	@Autowired
	private ClientRepository repository;
	
	/*public List<ClientDTO> findAll(){
		List <Client> todos = repository.findAll();
		return todos.stream().map(x -> new ClientDTO(x)).collect(Collectors.toList());
	}*/
	

	@Transactional(readOnly = true)
	public Page<ClientDTO> findAllPaged(PageRequest pageRequest) {
		Page<Client> list = repository.findAll(pageRequest);
		return list.map(x -> new ClientDTO(x));
	}
	
	@Transactional(readOnly = true)
	public ClientDTO findById(Long id) {
		Optional<Client> obj = repository.findById(id);
		Client entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not Found"));
		return new ClientDTO(entity);
	}
	
}
