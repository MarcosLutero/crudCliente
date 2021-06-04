package com.empresa.crudcliente.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.crudcliente.dto.ClientDTO;
import com.empresa.crudcliente.services.ClientService;

@RestController
@RequestMapping(value="/client")
public class ClienteController {
	
	@Autowired
	private ClientService service;
	
	@GetMapping
	public ResponseEntity<List<ClientDTO>> findAll(){
		
		List<ClientDTO> list = service.findAll();
		return ResponseEntity.ok(list);
		
	}
	
}
