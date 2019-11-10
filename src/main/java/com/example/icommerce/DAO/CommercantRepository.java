package com.example.icommerce.DAO;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.icommerce.entities.Commercant;

public interface CommercantRepository  extends JpaRepository<Commercant,Long>{

}
