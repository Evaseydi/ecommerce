package com.example.icommerce.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.icommerce.entities.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long>{

}
