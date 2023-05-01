package com.example.producto.DAO;



import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.producto.entities.Product;

public interface ProductDAO extends CrudRepository<Product,Long>{
	
	Optional<Product> findByName(String name);
}
