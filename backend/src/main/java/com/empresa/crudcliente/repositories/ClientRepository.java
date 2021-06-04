package com.empresa.crudcliente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.empresa.crudcliente.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

	
}
