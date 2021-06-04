package com.empresa.crudcliente.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.crudcliente.dto.ClientDTO;
import com.empresa.crudcliente.entities.Client;
import com.empresa.crudcliente.repositories.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository repository;
	
	public List<ClientDTO> findAll(){
		List <Client> todos = repository.findAll();
		return todos.stream().map(x -> new ClientDTO(x)).collect(Collectors.toList());
	}
	
}
