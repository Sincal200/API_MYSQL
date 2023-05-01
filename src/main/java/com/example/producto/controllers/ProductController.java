package com.example.producto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.producto.entities.Product;
import com.example.producto.services.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	//inyectar el servicio de productos
	@Autowired
	ProductService productService;
	
	@GetMapping
	public List<Product> listarProductos(){
		return productService.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public Product obtenerProducto(@PathVariable Long id) {
		return productService.findById(id);
	}
	
	@PostMapping()
	public void crearProducto(@RequestBody Product product) {
		productService.createProduct(product);
	}
	
	@PutMapping(value = "/{id}")
	public void modificarProducto(@PathVariable Long id, @RequestBody Product product) {
		productService.modifyProduct(id,product);
	}
	
	@DeleteMapping(value = "/{id}")
	public void modificarProducto(@PathVariable Long id) {
		productService.deleteProduct(id);
	}
	
	@GetMapping(value = "/name/{name}")
	public Product obtenerProductoPorNombre(@PathVariable String name) {
	    return productService.findByName(name);
	}
	
}
