package com.hr.apirest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.apirest.models.ProductoModel;
import com.hr.apirest.repositories.ProductoRepository;

@Service
public class ProductoService {
  @Autowired
  private ProductoRepository productoRepository;

  public ProductoModel saveProduct(ProductoModel product) {
    return productoRepository.save(product);
  }

  public List<ProductoModel> getProducts() {
    return productoRepository.getAllProductos();
  }

  public Optional<ProductoModel> getProductById(int id) {
    return productoRepository.findById(id);
  }

  public String deleteProduct(int id) {
    productoRepository.delete(id);
    return "Producto Eliminado Correctamente " + id;
  }

  public ProductoModel updateProduct(ProductoModel product) {
    return productoRepository.update(product);
  }
}
