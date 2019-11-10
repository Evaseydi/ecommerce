package com.example.icommerce.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.icommerce.entities.Client;


public interface ClientRepository  extends JpaRepository<Client, Long>{

}
