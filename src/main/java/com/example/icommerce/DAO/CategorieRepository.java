package com.example.icommerce.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.icommerce.entities.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie, Long> {

}
