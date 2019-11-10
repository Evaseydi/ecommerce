package com.example.icommerce.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.icommerce.entities.Departement;

public interface DepartementRepository extends JpaRepository<Departement, Long> {

}
