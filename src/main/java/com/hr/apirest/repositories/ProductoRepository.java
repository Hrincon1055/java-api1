package com.hr.apirest.repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.hr.apirest.models.ProductoModel;

@Repository
public class ProductoRepository {
  private List<ProductoModel> productos = new ArrayList<ProductoModel>();

  public ProductoRepository() {
    if (productos.isEmpty()) {
      createProducto();
    }
  }

  public void createProducto() {
    productos.add(new ProductoModel(1, "Producto 1", 2, 1000));
    productos.add(new ProductoModel(2, "Producto 2", 8, 2000));
    productos.add(new ProductoModel(3, "Producto 3", 5, 3000));
    productos.add(new ProductoModel(4, "Producto 4", 20, 250));
    productos.add(new ProductoModel(5, "Producto 5", 12, 1000));
    productos.add(new ProductoModel(6, "Producto 6", 78, 1000));
    productos.add(new ProductoModel(7, "Producto 7", 35, 1000));
    productos.add(new ProductoModel(8, "Producto 8", 9, 1000));
    productos.add(new ProductoModel(9, "Producto 9", 33, 1000));
    productos.add(new ProductoModel(10, "Producto 10", 50, 1000));
  }

  public List<ProductoModel> getAllProductos() {
    return productos;
  }

  public Optional<ProductoModel> findById(int id) {
    return productos.stream()
        .filter(producto -> producto.getId() == id)
        .findFirst();
  }

  public List<ProductoModel> search(String nombre) {
    return productos.stream()
        .filter(producto -> producto.getNombre().startsWith(nombre))
        .collect(Collectors.toList());
  }

  public ProductoModel save(ProductoModel product) {
    ProductoModel newProduct = new ProductoModel();
    newProduct.setId(product.getId());
    newProduct.setNombre(product.getNombre());
    newProduct.setCantidad(product.getCantidad());
    newProduct.setPrecio(product.getPrecio());
    productos.add(newProduct);
    return newProduct;
  }

  public String delete(int id) {
    boolean removed = productos.removeIf(productId -> productId.getId() == id);
    System.out.println(removed);
    return null;
  }

  public ProductoModel update(ProductoModel product) {
    int productId = product.getId();
    productos.replaceAll(existingProduct -> {
      if (existingProduct.getId() == productId) {
        return product;
      }
      return existingProduct;
    });
    return product;
  }
}
