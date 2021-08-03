package pl.wojciechdomagala.dietapp.product.service;

import pl.wojciechdomagala.dietapp.product.model.Product;

import java.util.List;

public interface ProductService {
    void saveProductInfo(Product product);
    List<Product> getProductInfo();
}
