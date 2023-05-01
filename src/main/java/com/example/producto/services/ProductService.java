package com.example.producto.services;

import java.util.List;

import com.example.producto.entities.Product;

public interface ProductService {
	public List<Product> findAll();
	public Product findById(Long id);
	public void createProduct(Product product);
	public void modifyProduct(Long id,Product product);
	public void deleteProduct(Long id);
	public Product findByName(String name);
}
