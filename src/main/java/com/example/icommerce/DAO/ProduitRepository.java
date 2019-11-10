package com.example.icommerce.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.icommerce.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long>{

}
