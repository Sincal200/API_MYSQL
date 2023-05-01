package com.example.producto.DAO;

import org.springframework.data.repository.CrudRepository;

import com.example.producto.entities.Product;

public interface ProductDAO extends CrudRepository<Product,Long>{
	
}
