package org.demo.sesame.metier;

import java.util.List;


import org.demo.sesame.entities.Produit;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.Query;
@Repository
public interface ProduitRepository extends MongoRepository<Produit, Long>{
	@Query("{'designation' : ?0} ")
	public Page<Produit> produitparMC(@Param("x")String mc, Pageable p);
	public List<Produit> findByDesignation(String des);
	public Page<Produit> findByDesignation(String des,Pageable p);
}