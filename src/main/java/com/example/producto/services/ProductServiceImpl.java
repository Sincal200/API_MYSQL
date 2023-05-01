package com.example.producto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.producto.DAO.ProductDAO;
import com.example.producto.entities.Product;

@Service
public class ProductServiceImpl implements ProductService{
	//Inyectamos el DAO
	@Autowired
	private ProductDAO productDao;

	//Implementación del método para listar
	@Override
	public List<Product> findAll() {
		return (List<Product>)productDao.findAll();
		}
	//Implemetación del método para obtener producto en específico
	@Override
	public Product findById(Long id) {
		//El dao retorna un optional para proteger de valores nulos
		return productDao.findById(id).orElse(null);
	}
	@Override
	public void createProduct(Product product) {
		productDao.save(product);
		
	}
	@Override
	public void modifyProduct(Long id, Product product) {
		if(productDao.existsById(id)){
			product.setId(id);
			productDao.save(product);
		}
		
	}
	@Override
	public void deleteProduct(Long id) {
		if(productDao.existsById(id)) {
			productDao.deleteById(id);
		}
	}	
}
