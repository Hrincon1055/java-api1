package com.hr.apirest.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hr.apirest.models.ProductoModel;
import com.hr.apirest.services.ProductoService;

@RestController
@RequestMapping("/api/v1/productos")
public class PorductoController {
  @Autowired
  private ProductoService productoService;

  @PostMapping
  public ProductoModel saveProduct(@RequestBody ProductoModel product) {
    return productoService.saveProduct(product);
  }

  @GetMapping
  public List<ProductoModel> getProducts() {
    return productoService.getProducts();
  }

  @GetMapping("/{id}")
  public Optional<ProductoModel> getProductById(@PathVariable("id") int id) {
    return productoService.getProductById(id);
  }

  @PutMapping
  public ProductoModel updateProduct(@RequestBody ProductoModel product) {
    return productoService.updateProduct(product);
  }

  @DeleteMapping("/{id}")
  public String deleteProduct(@PathVariable("id") int id) {
    return productoService.deleteProduct(id);
  }
}
