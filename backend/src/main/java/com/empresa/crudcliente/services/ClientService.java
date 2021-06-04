package com.empresa.crudcliente.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.empresa.crudcliente.dto.ClientDTO;
import com.empresa.crudcliente.entities.Client;
import com.empresa.crudcliente.repositories.ClientRepository;

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
	
}
